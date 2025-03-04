package org.scalablytyped.converter.internal
package importer

import com.olvind.logging.{Formatter, Logger}
import org.scalablytyped.converter.Selection
import org.scalablytyped.converter.internal.importer.Phase1Res._
import org.scalablytyped.converter.internal.importer.Source.TsSource
import org.scalablytyped.converter.internal.maps._
import org.scalablytyped.converter.internal.phases.{GetDeps, IsCircular, Phase, PhaseRes}
import org.scalablytyped.converter.internal.seqs.TraversableOps
import org.scalablytyped.converter.internal.sets.SetOps
import org.scalablytyped.converter.internal.ts.TsTreeScope.LoopDetector
import org.scalablytyped.converter.internal.ts.modules.ModuleAsGlobalNamespace
import org.scalablytyped.converter.internal.ts.{transforms => T, _}

import scala.collection.immutable.SortedMap

/**
  * This phase parses files, implements the module system, and "implements" a bunch of typescript features by rewriting the tree.
  * For instance defaulted parameters are filled in. The point is to go from a complex tree to a simpler tree
  */
class Phase1ReadTypescript(
    resolve:                 LibraryResolver,
    calculateLibraryVersion: CalculateLibraryVersion,
    ignored:                 Set[TsIdentLibrary],
    ignoredModulePrefixes:   Set[List[String]],
    pedantic:                Boolean,
    parser:                  InFile => Either[String, TsParsedFile],
    expandTypeMappings:      Selection[TsIdentLibrary],
) extends Phase[Source, Source, Phase1Res] {

  implicit val InFileFormatter: Formatter[InFile] =
    inFile =>
      if (inFile.path.segments.length > 3)
        inFile.path.segments.toList.takeRight(3).mkString("../", "/", "")
      else inFile.path.segments.mkString("/")

  implicit val InFolderFormatter: Formatter[InFolder] =
    _.path.toString

  def ignoreModule(moduleNames: IArray[TsIdentModule]): Boolean =
    moduleNames.exists(ignoreModule)

  def ignoreModule(modName: TsIdentModule): Boolean =
    (1 to modName.fragments.length).exists(n => ignoredModulePrefixes(modName.fragments.take(n)))

  override def apply(
      source:     Source,
      _1:         Source,
      getDeps:    GetDeps[Source, Phase1Res],
      isCircular: IsCircular,
      logger:     Logger[Unit],
  ): PhaseRes[Source, Phase1Res] = {

    source match {
      case source: Source.TsLibSource if ignored(source.libName) => PhaseRes.Ignore()
      case _ if isCircular => PhaseRes.Ignore()
      case Source.TsHelperFile(file, _, _) if !file.path.last.endsWith(".d.ts") =>
        PhaseRes.Ignore()
      case h: Source.TsHelperFile if ignoreModule(h.moduleNames) =>
        PhaseRes.Ignore()

      case s @ Source.TsHelperFile(file, inLib, _) =>
        val L = logger.withContext(file)

        def assertFilesOnly(m: SortedMap[Source, Phase1Res]): SortedMap[Source, LibTsFile] =
          m.map {
            case (s, part: LibTsFile) => s -> part
            case (s, other) => sys.error(s"$s: Unexpected $other")
          }

        def orWarn(ot: Option[Source])(onEmpty: String): PhaseRes[Source, Source] =
          ot match {
            case Some(value) => PhaseRes.Ok(value)
            case None =>
              L.warn(onEmpty)
              PhaseRes.Ignore()
          }

        PhaseRes.fromEither(source, parser(file)).flatMap { parsed: TsParsedFile =>
          val (
            pathRefsR: Set[PhaseRes[Source, Source]],
            typeRefsR: Set[PhaseRes[Source, Source]],
            libRefsR:  Set[PhaseRes[Source, Source]],
            _:         Set[Directive],
          ) =
            parsed.directives.toSet
              .partitionCollect3(
                {
                  case r @ Directive.PathRef(value) =>
                    val maybeSource: Option[Source] =
                      LibraryResolver.file(file.folder, value).map(Source.helperFile(inLib))
                    orWarn(maybeSource)(s"Couldn't resolve $r")
                }, {
                  case Directive.TypesRef(value) =>
                    val maybeSource: Option[Source] = resolve.module(s, value).map(_._1)
                    orWarn(maybeSource)(s"Couldn't resolve $value")
                }, {
                  case r @ Directive.LibRef(value) if inLib.libName === TsIdent.std =>
                    val maybeSource: Option[Source] =
                      LibraryResolver.file(resolve.stdLib.folder, s"lib.$value.d.ts").map(Source.helperFile(inLib))
                    orWarn(maybeSource)(s"Couldn't resolve $r")
                },
              )

          for {
            /* Ensure we resolved all modules referenced by a path directive */
            pathRefs <- PhaseRes.sequenceSet(pathRefsR ++ libRefsR)
            /* Assert all path directive referenced modules are files (not libraries) */
            toInline <- getDeps(pathRefs.sorted).map(assertFilesOnly)

            withoutDirectives = parsed.copy(directives = IArray.Empty)

            /* Ensure we resolved all modules referenced by a type reference directive */
            typeReferencedDeps <- PhaseRes.sequenceSet(typeRefsR)

            /* Resolve all references to other modules in `from` clauses, rename modules */
            withExternals = ResolveExternalReferences(resolve, source.asInstanceOf[TsSource], withoutDirectives, L)

            inferredDepNames = modules.InferredDependency(
              inLib.libName,
              withExternals.rewritten,
              withExternals.unresolvedDeps,
              L,
            )
            inferredDeps <- PhaseRes.sequenceSet(
              inferredDepNames.map(n => orWarn(resolve.module(s, n.value).map(_._1))(s"Couldn't resolve ${n.value}")),
            )

            /* look up all resulting dependencies */
            deps <- getDeps((withExternals.resolvedDeps ++ typeReferencedDeps ++ inferredDeps).sorted)
            withOrigin = {
              val file           = withExternals.rewritten
              lazy val shortName = s.file.path.last.split("\\.").drop(1).dropRight(2).mkString(".")
              if (source.libName === TsIdent.std && shortName.nonEmpty) {
                T.AddComments(Comments(List(Comment(s"/* standard $shortName */\n")))).visitTsParsedFile(())(file)
              } else file
            }

          } yield LibTsFile(FileAndInlinesRec(withOrigin, toInline), deps)
        }

      case source: Source.TsLibSource =>
        val fileSources: Set[Source.TsHelperFile] =
          PathsFromTsLibSource(source)

        val stdlibSourceOpt: Option[Source] =
          if (fileSources.exists(_.path === resolve.stdLib.path)) None else Option(resolve.stdLib)

        if (fileSources.isEmpty) {
          logger
            .withContext("path", source.folder)
            .warn(s"No typescript definitions files found for library ${source.libName.value}")
          PhaseRes.Ignore()
        } else {
          val declaredDependencies =
            if (stdlibSourceOpt.isEmpty) Set.empty
            else
              source.packageJsonOpt.getOrElse(PackageJson.Empty).allLibs(dev = false, peer = true).flatMap {
                case (depName, _) =>
                  resolve.library(depName) match {
                    case LibraryResolver.Found(source) =>
                      Some(source)
                    case LibraryResolver.Ignored(_) =>
                      None
                    case LibraryResolver.NotAvailable(name) =>
                      logger.fatalMaybe(s"Could not find typescript definitions for dependency ${name.value}", pedantic)
                      None
                  }
              }

          getDeps((fileSources ++ declaredDependencies ++ stdlibSourceOpt).sorted).map {
            case Unpack(
                libParts: SortedMap[Source.TsHelperFile, FileAndInlinesFlat],
                deps:     SortedMap[Source.TsLibSource, LibTs],
                ) =>
              val scope: TsTreeScope.Root =
                TsTreeScope(source.libName, pedantic, deps.map { case (source, lib) => source -> lib.parsed }, logger)

              val preprocessed: IArray[TsParsedFile] =
                libParts.mapToIArray {
                  case (helperSource, file) =>
                    logger.info(s"Preprocessing $helperSource")
                    val _1 = modules.InferredDefaultModule(file.file, helperSource.moduleNames.head, logger)
                    val _2 = FlattenTrees(_1 +: file.toInline.toIArrayValues(keep = !_.isModule))

                    val _3 = helperSource.moduleNames match {
                      case IArray.exactlyOne(_) => _2
                      case more =>
                        _2.copy(members = _2.members.map {
                          case m: TsDeclModule if more.contains(m.name) =>
                            m.copy(comments = m.comments + Marker.ModuleAliases(more.filterNot(_ === m.name)))
                          case other => other
                        })
                    }
                    T.SetCodePath.visitTsParsedFile(CodePath.HasPath(source.libName, TsQIdent.empty))(_3)
                }

              val involvesReact = {
                val react = TsIdentLibrarySimple("react")
                source.libName === react || deps.exists { case (s, _) => s.libName === react }
              }

              logger.withContext("path", source.folder).warn(s"Processing ${source.libName.value}")

              val flattened = FlattenTrees(preprocessed)

              val filteredModules: TsParsedFile =
                if (ignoredModulePrefixes.nonEmpty)
                  flattened.copy(members = flattened.members.filterNot {
                    case x: TsDeclModule      => ignoreModule(x.name)
                    case x: TsAugmentedModule => ignoreModule(x.name)
                    case _ => false
                  })
                else flattened

              val finished = Phase1ReadTypescript
                .Pipeline(scope, source.libName, expandTypeMappings, involvesReact)
                .foldLeft(filteredModules) { case (acc, f) => f(acc) }

              val version = calculateLibraryVersion(
                source.folder,
                source.isInstanceOf[Source.StdLibSource],
                source.packageJsonOpt,
                finished.comments,
              )

              LibTs(source)(version, finished, deps)
          }
        }
    }
  }
}

object Phase1ReadTypescript {
  def Pipeline(
      scope:              TsTreeScope.Root,
      libName:            TsIdentLibrary,
      expandTypeMappings: Selection[TsIdentLibrary],
      involvesReact:      Boolean,
  ): List[TsParsedFile => TsParsedFile] =
    List(
      T.LibrarySpecific(libName).fold[TsParsedFile => TsParsedFile](identity)(_.visitTsParsedFile(scope)),
      T.SetJsLocation.visitTsParsedFile(JsLocation.Global(TsQIdent.empty)),
      (T.SimplifyParents >>
        T.RemoveStubs >> //before HandleCommonJsModules and QualifyReferences
        T.InferTypeFromExpr >>
        T.InferEnumTypes /* before InlineConstEnum */ >>
        T.NormalizeFunctions /* before FlattenTrees */ >>
        T.MoveStatics).visitTsParsedFile(scope.enableUnqualifiedLookup.caching),
      (modules.HandleCommonJsModules >> modules.RewriteExportStarAs)
        .visitTsParsedFile(scope), //before QualifyReferences
      new T.QualifyReferences(skipValidation = false).visitTsParsedFile(scope.enableUnqualifiedLookup.caching),
      modules.AugmentModules(scope.caching),
      T.ResolveTypeQueries.visitTsParsedFile(scope.enableUnqualifiedLookup.caching), // before ReplaceExports
      new modules.ReplaceExports(LoopDetector.initial).visitTsParsedFile(scope.enableUnqualifiedLookup.caching),
      file => ModuleAsGlobalNamespace(scope.root.libName, file),
      modules.MoveGlobals.apply,
      FlattenTrees.apply,
      (
        T.DefaultedTypeArguments >> //after FlattenTrees
          T.TypeAliasIntersection >> // before ExpandTypeMappings
          T.RejiggerIntersections
      ).visitTsParsedFile(scope.caching),
      if (expandTypeMappings(libName)) T.ExpandTypeMappings.visitTsParsedFile(scope.caching) else identity, // before ExtractInterfaces
      if (expandTypeMappings(libName)) T.ExpandTypeMappings.After.visitTsParsedFile(scope.caching) else identity, // before ExtractInterfaces
      (
        T.SimplifyConditionals >> // after ExpandTypeMappings
          T.TypeAliasToConstEnum >>
          T.ForwardCtors >>
          T.ExpandTypeParams >>
          T.UnionTypesFromKeyOf >>
          T.DropProperties >>
          T.InferReturnTypes >>
          T.RewriteTypeThis >>
          T.InlineConstEnum >>
          T.InlineTrivial
      ).visitTsParsedFile(scope.caching),
      T.ResolveTypeLookups
        .visitTsParsedFile(scope.caching), //before ExpandCallables and ExtractInterfaces, after InlineTrivialTypeAlias and ExpandKeyOfTypeParams
      x => T.PreferTypeAlias(x, scope), // before extract interfaces
      T.ExtractInterfaces(libName, TsIdent("anon"), scope.caching), // before things which break initial ordering of members, like `ExtractClasses`
      (
        if (involvesReact) T.ExtractClasses
        else T.ExtractClasses >> T.ExpandCallables
      ).visitTsParsedFile(scope.caching),
      (T.SplitMethods /* after ExpandCallables */ >>
        T.RemoveDifficultInheritance >>
        T.VarToNamespace // after ExtractClasses
      ).visitTsParsedFile(scope.caching),
    )
}

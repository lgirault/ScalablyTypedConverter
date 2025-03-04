package typingsSlinky.react.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base component for plain JS classes
// tslint:disable-next-line:no-empty-interface
@JSImport("react", "Component")
@js.native
open class Component[P, S, SS] protected ()
  extends StObject
     with ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  def this(props: P, context: Any) = this()
  
  /**
    * If using the new style context, re-declare this in your class to be the
    * `React.ContextType` of your `static contextType`.
    *
    * ```ts
    * static contextType = MyContext
    * context!: React.ContextType<typeof MyContext>
    * ```
    *
    * @deprecated if used without a type annotation, or without static contextType
    * @see https://reactjs.org/docs/legacy-context.html
    */
  // TODO (TypeScript 3.0): unknown
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  // React.Props<T> is now deprecated, which means that the `children`
  // property is not available on `P` by default, even though you can
  // always pass children as variadic arguments to `createElement`.
  // In the future, if we can define its call signature conditionally
  // on the existence of `children` in `P`, then we should remove this.
  val props: P & typingsSlinky.react.anon.Children = js.native
  
  /**
    * @deprecated
    * https://reactjs.org/docs/refs-and-the-dom.html#legacy-api-string-refs
    */
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): slinky.core.facade.ReactElement = js.native
  
  // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  // Also, the ` | S` allows intellisense to not be dumbisense
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: S): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: S, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Pick[S, K]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Pick[S, K], callback: js.Function0[Unit]): Unit = js.native
  
  var state: S = js.native
}
object Component {
  
  @JSImport("react", "Component")
  @js.native
  val ^ : js.Any = js.native
  
  // tslint won't let me format the sample code in a way that vscode likes it :(
  /**
    * If set, `this.context` will be set at runtime to the current value of the given Context.
    *
    * Usage:
    *
    * ```ts
    * type MyContext = number
    * const Ctx = React.createContext<MyContext>(0)
    *
    * class Foo extends React.Component {
    *   static contextType = Ctx
    *   context!: React.ContextType<typeof Ctx>
    *   render () {
    *     return <>My context's value: {this.context}</>;
    *   }
    * }
    * ```
    *
    * @see https://reactjs.org/docs/context.html#classcontexttype
    */
  /* static member */
  @JSImport("react", "Component.contextType")
  @js.native
  def contextType: js.UndefOr[Context[Any]] = js.native
  inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}

organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "6.5.2-f2150a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-b8c5b2",
  "org.scalablytyped" %%% "pixi__accessibility" % "6.5.2-34ddb7",
  "org.scalablytyped" %%% "pixi__app" % "6.5.2-4a0290",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "6.5.2-7fca45",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.2-0ed2af",
  "org.scalablytyped" %%% "pixi__core" % "6.5.2-402944",
  "org.scalablytyped" %%% "pixi__display" % "6.5.2-3d8c6f",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.2-815daf",
  "org.scalablytyped" %%% "pixi__extract" % "6.5.2-d2fb06",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "6.5.2-06d70b",
  "org.scalablytyped" %%% "pixi__filter-blur" % "6.5.2-303a78",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "6.5.2-3f3ab0",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "6.5.2-63c194",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "6.5.2-1b9282",
  "org.scalablytyped" %%% "pixi__filter-noise" % "6.5.2-af460c",
  "org.scalablytyped" %%% "pixi__graphics" % "6.5.2-0c3b59",
  "org.scalablytyped" %%% "pixi__interaction" % "6.5.2-eb1ea5",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.2-723443",
  "org.scalablytyped" %%% "pixi__math" % "6.5.2-44c644",
  "org.scalablytyped" %%% "pixi__mesh" % "6.5.2-d989ae",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "6.5.2-299fb0",
  "org.scalablytyped" %%% "pixi__particle-container" % "6.5.2-c0eece",
  "org.scalablytyped" %%% "pixi__prepare" % "6.5.2-dbf5a8",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.2-dd6026",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.2-b584fb",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.2-675091",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "6.5.2-137dc8",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "6.5.2-fce89a",
  "org.scalablytyped" %%% "pixi__spritesheet" % "6.5.2-a75900",
  "org.scalablytyped" %%% "pixi__text" % "6.5.2-98629d",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "6.5.2-c2f95e",
  "org.scalablytyped" %%% "pixi__ticker" % "6.5.2-f27a6f",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.2-1a0ed9",
  "org.scalablytyped" %%% "std" % "0.0-unknown-dd36a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

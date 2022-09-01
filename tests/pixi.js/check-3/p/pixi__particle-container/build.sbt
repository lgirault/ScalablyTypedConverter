organization := "org.scalablytyped"
name := "pixi__particle-container"
version := "6.5.2-c0eece"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-b8c5b2",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.2-0ed2af",
  "org.scalablytyped" %%% "pixi__core" % "6.5.2-402944",
  "org.scalablytyped" %%% "pixi__display" % "6.5.2-3d8c6f",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.2-815daf",
  "org.scalablytyped" %%% "pixi__math" % "6.5.2-44c644",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.2-dd6026",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.2-b584fb",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.2-675091",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.2-1a0ed9",
  "org.scalablytyped" %%% "std" % "0.0-unknown-dd36a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-4ab3c4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-a2e249",
  "org.scalablytyped" %%% "mime" % "2.0-aa3c41",
  "org.scalablytyped" %%% "std" % "0.0-unknown-20654c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
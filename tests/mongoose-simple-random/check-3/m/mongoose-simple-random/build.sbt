organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-37ac9e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-f915a5",
  "org.scalablytyped" %%% "node" % "0.0-unknown-30ee16",
  "org.scalablytyped" %%% "std" % "0.0-unknown-92bf4e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

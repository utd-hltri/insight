name := "insight"

organization := "edu.utdallas.hltri"

version := "1.0.0"

publishTo := sonatypePublishTo.value

lazy val commonSettings = Seq(
  // Use latest scala version
  scalaVersion := "2.10.4",
  // Connects STDIN to sbt during forked runs
  connectInput in run := true,
  // Get rid of output prefix
  outputStrategy in run := Some(StdoutOutput),
  // When  using sbt-run, fork to a new process instead of running within the sbt process
  fork in run := true,
  // Set default java options: enable assertions, set memory, set server mode
  javaOptions ++= Seq("-ea", "-esa", "-Xmx14g", "-server"),
  // Set javac options
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint:unchecked"),
  // Always export a .jar rather than .class files
  exportJars := true,
  // hltri util
  libraryDependencies += "edu.utdallas.hltri" % "hltri-util" % "1.0.1"
)

lazy val insight = (project in file("."))
  .aggregate(`insight-ollie`, `insight-wiki`)
  .settings(commonSettings)

lazy val `insight-ollie` = (project in file("insight-ollie"))
  .settings(commonSettings)

lazy val `insight-wiki` = (project in file("insight-wiki"))
  .settings(commonSettings)

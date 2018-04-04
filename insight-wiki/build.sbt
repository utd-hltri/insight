name := "insight-wiki"

organization := "edu.utdallas.hltri"

version := "1.0.1"

publishTo := sonatypePublishTo.value

// enable publishing to maven
publishMavenStyle := true

// do not append scala version to the generated artifacts
crossPaths := false

// do not add scala libraries as a dependency!
autoScalaLibrary := false


import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val MonocleVersion = "2.0.4"

lazy val root = (project in file("."))
  .settings(
    name := "monocle-macros-test",
    libraryDependencies ++= Seq(
      "com.github.julien-truffaut"  %%  "monocle-core"    % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-generic" % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-macro"   % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-state"   % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-refined" % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-unsafe"  % MonocleVersion,
      "com.github.julien-truffaut"  %%  "monocle-law"     % MonocleVersion % "test",
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

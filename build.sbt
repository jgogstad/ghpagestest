import Dependencies._
import microsites._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "ghpagestest",
    libraryDependencies += scalaTest % Test,
    micrositeConfigYaml := ConfigYml(
      yamlCustomProperties = Map(
        "repoVersion"       -> version.value,
        "scalaVersions"     -> crossScalaVersions.value.flatMap(CrossVersion.partialVersion).map(_._2).mkString("2.", "/", "") // 2.11/12
      )
    )
  )
  .enablePlugins(MicrositesPlugin)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
import sbt._
import Dependencies._
import BuildConstants._

// ------------------------------------------------------
// main project
<<<<<<< HEAD
lazy val course = (project in file(".")).
=======
lazy val assignments = (project in file(".")).
>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904
  settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
<<<<<<< HEAD
    name := "course",
=======
    name := "assignments",
>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904
    libraryDependencies += scalaTest
  )

// ------------------------------------------------------
// common
<<<<<<< HEAD
lazy val common = (project in file("common/")).
=======
lazy val tutorial = (project in file("tutorial/")).
>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904
  settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
<<<<<<< HEAD
    name := "common",
=======
    name := "tutorial",
>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904
    libraryDependencies += scalaTest,
    fork := true
  )


<<<<<<< HEAD
// ------------------------------------------------------
// labs

lazy val labs = (project in file("labs/")).
=======

lazy val functional = (project in file("functional/")).
>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904
 settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
<<<<<<< HEAD
    name := "labs",
    libraryDependencies += scalaTest,
    fork := true
  ).dependsOn(common)

// END labs ----------------------------------------------
=======
    name := "functional",
    libraryDependencies += scalaTest,
    fork := true
  )

>>>>>>> 69f36e241e6a77d98a6b7ad8a107d4c101415904

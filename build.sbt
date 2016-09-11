

lazy val root = (project in file(".")).
  settings(
    name := "template-sbt-travis",
    organization := "com.github.jostly",
    version := "0.1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    ),

    scalacOptions ++= Seq(
      "-Xfatal-warnings",
      "-Xlint:missing-interpolator",
      "-Ywarn-unused-import",
      "-Ywarn-unused",
      "-Ywarn-dead-code",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-explaintypes"
    )
  )

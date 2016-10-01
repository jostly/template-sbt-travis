import com.typesafe.sbt.SbtGit.GitKeys._

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin, GitVersioning, GitBranchPrompt).
  settings(
    name := "template-sbt-travis",
    organization := "com.github.jostly",
    scalaVersion := "2.11.8",

    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion, gitHeadCommit),
    buildInfoPackage := "com.github.jostly.template",

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
  ).
  settings(publishSettings:_*)

lazy val githubRepo = "jostly/template-sbt-travis"

lazy val publishSettings = Seq(
  homepage := Some(url(s"https://github.com/$githubRepo")),
  startYear := Some(2016),
  licenses := Seq(("Unlicense", url("http://unlicense.org"))),
  scmInfo := Some(
    ScmInfo(
      url(s"https://github.com/$githubRepo"),
      s"scm:git:https://github.com/$githubRepo.git",
      Some(s"scm:git:git@github.com:$githubRepo.git")
    )
  ),
  bintrayVcsUrl := Some(s"scm:git:git@github.com:$githubRepo.git"),
  bintrayCredentialsFile := file(".credentials"),
  publishMavenStyle := true,
  publishArtifact in Test := false,
  pomIncludeRepository := { _ => false },
  pomExtra := <developers>
    <developer>
      <id>jostly</id>
      <name>Johan Östling</name>
      <url>https://github.com/jostly</url>
    </developer>
  </developers>
)

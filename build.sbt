name := "deadbolt-2-usage-scala"

version := "2.3.0-RC1"

lazy val root = (project in file(".")).enablePlugins(play.PlayScala)

scalaVersion := "2.11.1"

organization := "be.objectify"

libraryDependencies ++= Seq(
  "be.objectify" %% "deadbolt-scala" % "2.3.0-RC1"
)

resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns)


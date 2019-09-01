name := "Play2Skeleton"

version := "2.0-RC"

lazy val `play2skeleton` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  ehcache,
  ws,
  guice,
)
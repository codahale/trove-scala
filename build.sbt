name := "trove-scala"

version := "0.1.0"

organization := "com.codahale"

scalaVersion := "2.10.3"

// crossPaths := false
//
retrieveManaged := true

resolvers ++= Seq(
  "repo.codahale.com" at "http://repo.codahale.com"
//  Resolver for trove-scala source; nonexistent here yet
//  "repo.codahale.com" at "http://repo.codahale.com",
//  Resolver if you want to find stuff out of your local Maven cache
//  "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
  )

libraryDependencies ++= Seq(
  "net.sf.trove4j" % "trove4j" % "3.0.3",
  "com.simple" % "simplespec_2.10.2" % "0.8.4"
  )

// turn on all warnings in Java code
javacOptions ++= Seq("-Xlint")

// turn on all Scala warnings; also turn on deprecation warnings.
scalacOptions ++= Seq("-deprecation", "-Xlint", "-unchecked")

// Add optimization
scalacOptions ++= Seq("-optimise")

name := "STTP"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= List("com.softwaremill.sttp" %% "core" % "1.5.9")

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.20"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.20"

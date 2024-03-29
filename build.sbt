organization := "com.okosmos"

name         := "hello2akka"

version      := "0.1"

scalaVersion := "2.10.2"

scalacOptions := Seq("-unchecked",
                    "-deprecation",
                    "-encoding",
                    "UTF-8",
                    "-feature",
                    "-language:postfixOps")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.1",
  "com.typesafe.akka" %% "akka-testkit" % "2.2.1" % "test"
)

parallelExecution in Test := false

ideaExcludeFolders ++= Seq(".idea", ".idea_modules")
  
  

name := "sippo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq (
  "org.apache.sshd" % "apache-sshd" % "0.14.0",
  "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2",
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)

libraryDependencies ~= { _.map(_.exclude("org.slf4j", "slf4j-jdk14")) }

mainClass in assembly := Some("org.kurochan.sippo.Boot")
jarName in assembly := { s"${name.value}-${version.value}.jar" }

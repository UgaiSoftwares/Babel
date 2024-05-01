name := """babel"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.apache.jena" % "apache-jena-libs" % "2.11.0",
  "net.sf.jung" % "jung2" % "2.0.1",
  "net.sourceforge.collections" % "collections-generic" % "4.01",
  "commons-collections" % "commons-collections" % "3.2.1",
  "commons-beanutils" % "commons-beanutils" % "1.9.2",
  "commons-configuration" % "commons-configuration" % "1.10",
  "commons-httpclient" % "commons-httpclient" % "3.1",
  "commons-io" % "commons-io" % "2.4",
  "com.sleepycat" % "je" % "5.0.73",
  "net.sf.jgrapht" % "jgrapht" % "0.8.3",
  "edu.mit" % "jwi" % "2.2.3",
  "org.apache.lucene" % "lucene-core" % "2.9.4",
  "mysql" % "mysql-connector-java" % "5.1.34",
  "net.sourceforge.owlapi" % "owlapi-distribution" % "4.0.1",
  ws
)

scalariformSettings




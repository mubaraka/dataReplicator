name := "dataReplicator"


version := "0.1"

scalaVersion := "2.12.4"

//sbtVersion := "0.13.0"
//sbtVersion := "1.0.0-M4"

/*resolvers ++= Seq(
  "Twitter Maven Repo" at "http://maven.twttr.com"
)*/

//resolvers ++= Seq(Resolver.sbtPluginRepo("releases"), Resolver.sbtPluginRepo("snapshots"))

//libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.7.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += "org.apache.hive" % "hive-jdbc" % "1.0.0"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.1"

//libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.10.0"
//libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.10.0"


//libraryDependencies += "com.typesafe.slick" %% "slick-codegen" % "3.2.1"
//libraryDependencies += "com.typesafe.slick" %% "slick" % "3.2.1"

//dependencyOverrides += "com.google.code.findbugs" % "jsr305" % "3.0.0"
//dependencyOverrides += "com.google.guava" % "guava" % "16.0.1" force()


libraryDependencies ++= Seq(
  //"com.amazonaws" % "aws-java-sdk" % "1.11.271",
  "com.amazonaws" % "aws-java-sdk" % "1.7.4",
  "org.apache.hadoop" % "hadoop-common" % "2.7.1",
  //"org.apache.hadoop" % "hadoop-aws" % "2.7.4",

  "org.apache.parquet" % "parquet-avro" % "1.8.1",
  "org.apache.avro"  %  "avro"  %  "1.7.7",
  "com.univocity"  %  "univocity-parsers"  %  "2.5.9",
  "org.json"  %  "json" % "20171018"
  //"org.apache.spark" %% "spark-core" % "2.2.1",
  //"org.apache.spark" %% "spark-sql" % "2.2.1"
  //"com.eed3si9n" %% "sbt-assembly" % "0.14.6"
)



assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case PathList("META-INF", "services", "org.apache.hadoop.fs.FileSystem") => MergeStrategy.concat
  /*case PathList("META-INF", xs @ _*) =>
    (xs map {_.toLowerCase}) match {
      case ("manifest.mf" :: Nil) => MergeStrategy.discard
      case ("org.apache.hadoop.fs.FileSystem" :: Nil) => MergeStrategy.concat
    }*/
  case _ => MergeStrategy.first
}
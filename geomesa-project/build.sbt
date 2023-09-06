version := "4.1.0-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.locationtech.geomesa" %% "geomesa-accumulo-datastore" % "3.5.2",
  "org.locationtech.geomesa" %% "geomesa-accumulo-spark" % "3.5.2",
  "org.locationtech.geomesa" %% "geomesa-utils" % "3.5.2",
  "org.apache.accumulo" % "accumulo-core" % "2.1.0",
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-catalyst" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-yarn" % "2.4.0" % "provided"
)

// assemblyMergeStrategy in assembly := {
//   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//   case x => MergeStrategy.first
// }
resolvers ++= Seq(
  "osgeo" at "https://repo.osgeo.org/repository/release",
  "confluent" at "https://packages.confluent.io/maven",
  "osgeo-alt" at "https://repo.osgeo.org/repository/release",
  "Geomajas Maven Repository" at "https://maven.geomajas.org",
  "Geotools" at "https://repo.boundlessgeo.com/main",
  "Geotools repository" at "https://repo.osgeo.org/repository/geotools-releases",
)
// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
// resolvers ++= Seq(
//   "osgeo" at "https://repo.osgeo.org/repository/release",
//   "confluent" at "https://packages.confluent.io/maven",
//   "Apache Accumulo Repository" at "https://repository.apache.org/content/repositories/releases/",
//   "GeoMesa Repository" at "https://repo.locationtech.org/content/repositories/geomesa-releases/"
// )



// Add necessary resolvers
// resolvers ++= Seq(
//   "locationtech-releases" at "https://repo.locationtech.org/content/groups/releases",
//   "boundlessgeo" at "https://repo.boundlessgeo.com/main",
//   "osgeo" at "https://download.osgeo.org/webdav/geotools",
//   "conjars.org" at "https://conjars.org/repo",
//   "media.javax" at "https://maven.geotoolkit.org",
//   "osgeo-alt" at "https://repo.osgeo.org/repository/release",
//   "Geomajas Maven Repository" at "https://maven.geomajas.org",
//   "Geotools" at "https://repo.boundlessgeo.com/main",
//   "Geotools repository" at "https://repo.osgeo.org/repository/geotools-releases",
// )

// val sparkVersion = "2.0.2"
// val geomesaVersion = "1.3.1"
// //val geomesaVersion = "1.3.2"

// libraryDependencies ++= Seq(
//   "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
//   , "org.apache.spark" %% "spark-catalyst" % sparkVersion % "provided"
//   , "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
// /**  , "org.apache.spark" %% "spark-yarn" % sparkVersion % "provided" **/
//   , "org.locationtech.geomesa" %% "geomesa-accumulo-datastore" % geomesaVersion
//   , "org.locationtech.geomesa" %% "geomesa-accumulo-spark" % geomesaVersion
//   , "org.locationtech.geomesa" %% "geomesa-spark-sql" % geomesaVersion
//   , "ch.qos.logback" % "logback-classic" % "1.1.7"
//   , "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
//   , "org.apache.accumulo" % "accumulo-core" % "1.7.3"
//   , "org.geotools" % "gt-epsg-hsql" % "17.1"
// )


// assemblyMergeStrategy in assembly := {
//   case path => {
//     val strategy = (assemblyMergeStrategy in assembly).value(path)
//     if (strategy == MergeStrategy.deduplicate) {
//       MergeStrategy.first
//     } else {
//       strategy
//     }
//   }
// }


// /**
// assemblyMergeStrategy in assembly := {

//   case PathList("org","geotools", xs @ _*) => MergeStrategy.last
//   case x => 
//     val oldStrategy = (assemblyMergeStrategy in assembly).value
//     oldStrategy(x)
// }
// **/


  

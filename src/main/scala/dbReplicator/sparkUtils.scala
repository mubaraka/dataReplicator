package dbReplicator

import org.apache.spark.sql.SparkSession

object sparkUtils {

  def createSparkSession(): SparkSession = {
    val spark = SparkSession.builder.appName("dbReplicator").enableHiveSupport().getOrCreate()
    spark.conf.get("spark.sql.hive.metastore.version")
    spark
  }

  def setSparkJDBCProp(spark: SparkSession, table: String, userDB:String, passwordDB:String, jdbcDriverDB:String): java.util.Properties = {
    val prop = new java.util.Properties()
    prop.setProperty("user",userDB)
    prop.setProperty("password",passwordDB)
    prop.setProperty("driver",jdbcDriverDB)
    prop
  }

}
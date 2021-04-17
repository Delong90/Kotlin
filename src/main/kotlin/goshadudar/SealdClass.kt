package goshadudar

sealed class Db {
    data class MySQL(var id: Int, val conn:String): Db()
    data class MongoDb(var id: Int, val conn:String): Db()
//    {
//        fun printInfo(){
//            println("MongoDb has id: $id and connection: $conn")
//        }
//    }
    data class PostgreSQL(var id: Int, val conn:String, val isDone: Boolean): Db()
    object  Help : Db(){
        val conn = "Connection dan"
    }
}


fun Db.MongoDb.printInfo(){
    println(info)
}

val Db.MongoDb.info:String
get() = "MongoDb has id: $id and connection: $conn"

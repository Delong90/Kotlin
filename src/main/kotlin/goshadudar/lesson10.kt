package goshadudar

class Some{
    companion object{
        var count = 0
    }
    init {
        count++
        println("Создано объектов: $count")
    }
}


fun filterList(list:List<String>, filter: (String) -> Boolean){
    list.forEach{el ->
        if (filter(el))
            println(el)
    }
}

val filter: (String) -> Boolean = {
    it.startsWith("J")
}

fun main(args:Array<String>) {
    println("____________________________________")
    val list = listOf("Java","PHP","Perl","JavaScript","C++")
//    filterList(list,{it.startsWith("P")})
    filterList(list, filter)

    println("____________________________________")




    val test = Some()
    val test2 = Some()
    val test3 = Some()
    val test4 = Some()

    Some.count = 5

    val test5 = Some()

    println("____________________________________")

    val db = Db.MongoDb(conn="mongo", id = 5)
    val db2 = Db.PostgreSQL(conn="mongo", id = 5,isDone = true)

    val db_copy = db.copy()

    if (db == db_copy)
        println("Равны")
    else
        println("Не равны")

    val db_copy2 = db.copy(conn = "Done")
    if (db == db_copy2)
        println("Равны")
    else
        println("Не равны")

    if (db is Db.MongoDb) db.printInfo()
    if (db_copy is Db.MongoDb) db.printInfo()

}
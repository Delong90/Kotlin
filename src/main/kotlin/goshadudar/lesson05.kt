package goshadudar

fun main(args:Array<String>) {
    var items: Array<Int> = arrayOf(5, 7, 12, 4, 1)
    var items_list = listOf(5, 7, 12, 4, 1)
    var items_list2 = mutableListOf<Any>(5, 7, 12, 4, 1)
    var dogs = listOf<Any>("Bob","Charly")
//    val someArray = arrayOf(1)
    items.set(0,45)
    println(items[0])
    println(items.get(1))
    println(items.size)

    for (element in items) println(element)

    items.forEach { element -> println(element) }
    items.forEachIndexed { index, element -> println("$element с интдексом $index") }


    items_list.lastIndexOf(1)

    var user: Map<String, Any> = mapOf("name" to "Bob", "age" to 1, "isHasCar" to true)
    user.forEach{key, value -> println("$key + $value")}
    user.forEach{value, key -> println("$key + $value")}

    items_list2.add(5,"Hi")
    println(items_list2[5])

    items_list2.addAll(6, dogs)
    println(items_list2[6])

  items_list2.addAll(3,dogs)

    printArray(items_list2)
    println(items_list2[4])

}

fun  printArray(items: List<Any>){
    items.forEach{el-> println(el)}


}




package goshadudar

fun printSome(item:String = "Hi", vararg word: Any){
    print("$item: ")
    word.forEach { e-> print("$e ")}
    println()
}

fun main(args:Array<String>) {
    val names = arrayOf("Bob","Tom","Charly")
    printSome()
    printSome(word = *arrayOf("Hi"))
    printSome("Hi","Some")
    printSome("Hi","Some","Hello")
    printSome("Hi","Some","Hello","World", 1, 1.2)
    printSome("Hi",*names)

    //__________________________________________________________________
    var items = 5
    while (items>0){
        println(items)
        items--
    }
    items = 5
    do {
        println("Items = $items")
        items--
    } while (items>0)


    //__________________________________________________________________
    for (i in 0..7 step 2){
        println(i)
    }
    //__________________________________________________________________
    for (i in 7 downTo 0 step 2){
        println(i)
    }
    //__________________________________________________________________
    for (el in 'a'..'d'){
        println(el)
    }
    //__________________________________________________________________
    val x = 4
    if (x in 5..30){
        println("Variable: $x")
    } else println("Not Variable")




}
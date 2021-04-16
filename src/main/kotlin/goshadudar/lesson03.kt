package goshadudar

fun main(args:Array<String>) {
    var word: String? = null
    var isHasCar = false

    word = "Hello"

    if (word == null) {
        println("Пременная word равна значению null")
    } else if (word == "Hello") {
        println("Пременная: $word")
    } else println("Пременная word равна значению $word")

    if (isHasCar) println("Это правда")
    if (!isHasCar) println("Это неправда")

    if (!isHasCar || word == null) println("Что то сработало")
    if (!isHasCar && word == null) println("Что то сработало2")


    when (word) {
        null -> println("Пременная word равна значению null")
        "Hello" -> println("Пременная: $word")
        else -> println("Пременная word равна значению $word")
    }

    val number: Int? = null
//    var res = if (number>30) 1 else 0
//
//    println(res)

    val words = when(number){
        null-> "Ничего"
        else-> number
    }

    println("words = $words")



}
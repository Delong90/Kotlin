package mytask

import java.util.*

fun main(args:Array<String>) {

    for(i in 1 until  10 step 2){
        print("$i ")
    }

    //________________________________________________________________________________
    println()
    for (i in 100 downTo  1 step 5){
        print("$i ")
    }


    println()
    var a : Array<Int> = arrayOf(1,2,3,4,5)

    a.forEach { e -> print("$e ") }

    //________________________________________________________________________________
    println()
    val binaryReps = TreeMap<Char,String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter,binary)in binaryReps){
        println("$letter $binary")
    }
    //________________________________________________________________________________
    //2.4.4 Использование in для проверки вхождения в диапазон или коллекцию
    //________________________________________________________________________________
    fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c:Char) = c !in '1'..'9'
    println(isLetter('q'))
    println(isNotDigit('x'))
    //________________________________________________________________________________
    fun recognize(c:Char) = when(c){
        in '0'..'9' -> "Цифра"
        in 'a'..'z' , in 'A'..'Z' -> "Буква"
        else ->"Неизвестно"
    }
    println(recognize('1'))
    println(recognize('d'))
    println(recognize('/'))
    //________________________________________________________________________________
    println("Kotlin" in "Java".."Scale")
    //________________________________________________________________________________
    println("Kotlin" in setOf("Java","Scale"))
    println(setOf("Java","Scale"))

    //________________________________________________________________________________




}
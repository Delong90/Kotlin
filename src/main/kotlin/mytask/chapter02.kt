package mytask

import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
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
    //2.5 Исключения в Kotlin
    //________________________________________________________________________________

    val percentage = 99
    if (percentage !in 1..100){
        throw IllegalArgumentException(
            "A percentage: $percentage"
        )
    }
    //________________________________________________________________________________
    val number = 99
    val percentage2 =
        if(number in 0..100)
            number
        else
            throw IllegalArgumentException(
                "A percentage: $percentage")
    println("percentage2 $percentage2")

    //________________________________________________________________________________
    //    2.5.1. <<try>>, <<catch>> и <<finaLLy>>
    //________________________________________________________________________________

    fun readNumber(reader : BufferedReader) : Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        }
        catch ( е : NumberFormatException) {
            return null
        }
        finally {
            reader.close( )
        }
    }

    val reader = BufferedReader(StringReader( "239" ))
    println(readNumber(reader))

}
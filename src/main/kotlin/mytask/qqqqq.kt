package mytask

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


fun main(args:Array<String>) {
//    var i = 5
//
//    var nf:RuleBasedNumberFormat = RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
//        RuleBasedNumberFormat.SPELLOUT)
//
//    var list = IntArray(5)
//    list[0]=2
//
//    println(list[0])





    var a = factorial(5)

    println(a)





}
fun factorial(n: Int): Int{
    // Мутирующая переменная (var)
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}
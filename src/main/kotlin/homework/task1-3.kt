

package homework

import kotlin.coroutines.coroutineContext

fun main(args:Array<String>) {

//        val billArray = intArrayOf(10, 1, 9)
//    "bon appetit"
//        assertEquals(fairlySplit, counter.calculateFairlySplit(billArray, 0, 5).toLowerCase())

//        val billArray = intArrayOf(3, 10, 2, 9, 18, 25)
//        assertEquals(fairlySplit, counter.calculateFairlySplit(billArray, 3, 29).toLowerCase())
//
//        val billArray = intArrayOf(3, 10, 2, 9)
//          assertEquals("5", counter.calculateFairlySplit(billArray, 1, 12).toLowerCase())

        val billArray = intArrayOf(3, 10, 2, 9, 18, 25, 45)
//        assertEquals("22", counter.calculateFairlySplit(billArray, 4, 69).toLowerCase())
//        println(calculateFairlySplit(billArray,0,5))
//        println(calculateFairlySplit(billArray,3,29))
//        println(calculateFairlySplit(billArray,1,12))
        println(calculateFairlySplit(billArray,4,69))
}

// TODO: Complete the following function
// The output could be "Bon Appetit" or the string with number(e.g "10")
fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {


    if ((bill.sum()-bill[k])/2-b==0){return "Bon Appetit"}
    else   {
        val output = b-(bill.sum()-bill[k])/2
        return ("$output")}


}
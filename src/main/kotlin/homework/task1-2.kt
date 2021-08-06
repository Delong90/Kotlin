package homework

import java.util.Collections.max
import java.util.Collections.min

fun main(args:Array<String>) {
//    val input = intArrayOf(1, 2, 3, 4, 5)
//    val result = intArrayOf(10, 14)
//
//    val input = intArrayOf(6, 2, 8, 15, 1)
//    val result = intArrayOf(17, 31)
//
//    val input = intArrayOf(13, 2, 36, 48, 59, 0, 120)
//    val result = intArrayOf(158, 278)
//
    val input = intArrayOf(10, 2, 36, 484, 759, 103, 120, 34, 3, 90, 908)
//    val result = intArrayOf(1641, 2547)



    getResult(input).forEach { el-> println(el) }


}

fun getResult(input: IntArray): IntArray {



    var output = IntArray(2) {0}

    output[0] = minSum(input)
    output[1] = maxSum(input)




    return output
}

fun minSum (input: IntArray): Int {
    var minSum: Int
    var maxElement = max(input.toMutableList())
    minSum = input.sum()-maxElement

    return minSum
}

fun maxSum (input: IntArray): Int {

    var maxSum: Int
    var minElement = min(input.toMutableList())
    maxSum = input.sum()-minElement
    return maxSum
}
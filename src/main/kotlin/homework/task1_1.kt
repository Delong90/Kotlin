package homework


fun main(args:Array<String>) {


//        val sadArray = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3)
//        val happyArray = intArrayOf(1, 2, 7, 8, 9, 3)

//    val sadArray = intArrayOf(1, 2, 2, 9, 93, 2, 6, 9, 6, 10)
//    val happyArray = intArrayOf(1, 2, 2, 2, 6, 9, 6, 10)
//
//    val sadArray = intArrayOf(56, 32, 5, 31, 43, 55, 11, 87, 43, 62)
//    val happyArray = intArrayOf(56, 32, 5, 11, 43, 62)
//
//    val sadArray = intArrayOf(1, 2, 2, 9, 93, 2, 6, 8, 6, 12)
//    val happyArray = intArrayOf(1, 2, 2, 2, 6, 8, 6, 12)

//    val sadArray = intArrayOf(1, 3, 1)
//    val happyArray = intArrayOf(1, 1)

//    val sadArray = intArrayOf(1, 3)


    val sadArray = intArrayOf()
//    val happyArray = intArrayOf()



    convertToHappy(sadArray).forEach { el-> println(el) }

}



fun convertToHappy(sadArray: IntArray): IntArray {
    if(sadArray.size>2) {
        var happyArray = convertToHappy2(sadArray)
        if(happyArray.size!=2) {
            do{
            var size1 = happyArray.size
            happyArray = convertToHappy2(happyArray)
            var size2 = happyArray.size}
            while (size1!=size2)

            return happyArray


            throw NotImplementedError("Not implemented")
        }   else return happyArray
    }   else return sadArray
}

fun convertToHappy2(sadArray: IntArray): IntArray {

    var happyArray:MutableList<Int> = mutableListOf()
    happyArray.add(sadArray[0])
    var j = 1
    do {
        if (sadArray[j]<sadArray[j-1]+sadArray[j+1]){
            happyArray.add(sadArray[j])
        }
        j++
    }while (j<sadArray.size-1)
    happyArray.add(sadArray[sadArray.lastIndex])


    return happyArray.toIntArray()

}



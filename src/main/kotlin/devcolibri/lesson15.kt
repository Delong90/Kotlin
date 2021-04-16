package devcolibri

fun main(args: Array<String>){

    val nums = 1..10
    val characters = 'a'..'z'

    val value = 3

//    for(num in nums){
//        if(num==value){
//            println("true")
//            break
//        }
//    }

    println(value in nums)

    println(isChar('p',characters))



}

fun isChar(char: Char, characters: CharRange) = char in characters
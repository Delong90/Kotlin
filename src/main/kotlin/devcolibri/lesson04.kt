package devcolibri
fun main(args: Array<String>){
    myFirstFunction()
    myFirstFunction2(1)
    println(myFirstFunction4(1,1.23))
}

fun myFirstFunction(): Int {
    return 1
}

fun myFirstFunction2(a: Long): Int {
    return a.toInt()
}

fun myFirstFunction3(){

}

fun myFirstFunction4(a: Long, b: Double) = a+b

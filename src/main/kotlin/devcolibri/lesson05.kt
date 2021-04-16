package devcolibri
fun main(args: Array<String>){

    val st:String? = getSt()

    val size = st!!.length

    println(size)
    println("$st World")

}

fun getSt(): String?{
    return "Hello"
}
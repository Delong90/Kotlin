package goshadudar

fun sayHello(first:String,number:Int): Unit{
    println("$first $number")
}

fun sum(a:Int,b:Int) {
    val c = a+b
    return println("($a+$b) = $c")
}

fun add(x:Int,y:Int):Int{
    return x+y
}

    fun saySomething(): String{
        return "Hello"
    }

    fun saySomething2():String = "Hello"


fun main(args:Array<String>) {
    sayHello("Hello",42)
    sum(2,5)
    val result = add(5,10)
    println(result)
    }
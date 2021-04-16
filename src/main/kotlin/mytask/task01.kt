package mytask

fun main(args:Array<String>) {

    val r = 2.355


    if (r>0){
        println(diametr(r))
        println(perimetr(r))
    } else println("Невалидное значения входных данных")



}

fun diametr(g:Double):Double{
    var c = 3.14*g*g
    return c
}

fun perimetr(g:Double):Double{
    var c = 2*3.14*g
    return c
    1111
}
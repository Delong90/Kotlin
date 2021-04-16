import  Color.*

fun main(args:Array<String>){

    var n = 20

    var r = when(n){
        1 ->"One"
        2 ->"Two"
        3 ->"Three"
        4 ->"Four"
        5 ->"Five"
        6 ->"Six"

        else -> "NONE"
    }

    println(r)

    var result = getFavoriteColor(WHITE)

    println(result)

    var a: Int = 1
    var b: Int = 4


    when{
        (a>b)-> println("$a>$b true")
        (a<b)-> println("$a<$b true")
        (a==b)-> println("$a==$b true")

    }

}

    fun getFavoriteColor(color: Color)=when(color){
        RED, GREEN ->"Красно-зелёный"
        BLACK, WHITE -> "Чёрно-белый"


        else -> "Без цвета"
    }


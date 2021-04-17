package goshadudar

enum class Animals{
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main(args:Array<String>) {

    var user = NewClass()
    println(user.getConnection())
    check(user)

    println("____________________________________")

    val user2 = object : MainProvider(){
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("Выводится текст из класса наследника")
        }
    }
    check(user2)
    println("____________________________________")

    val animal = Animals.BEAR
    when (animal)   {
        Animals.CAT -> println("Кошка")
        Animals.DOG -> println("Собака")
        Animals.BEAR -> println(animal.toLowerCase())
        Animals.LION -> println("Лев")


    }

}
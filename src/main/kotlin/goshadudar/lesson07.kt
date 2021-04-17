package goshadudar

fun main(args:Array<String>) {
    val alex = User("Alex","Petrov")

//    alex.firstName = "Alex"
    println(alex.firstName)
//    alex.printUser()

    val peter = User()
    println(peter.firstName)
    println(peter.secondName)

    alex.login = "Codi"
    println(alex.login)

    peter.login
    println(peter.login)
}
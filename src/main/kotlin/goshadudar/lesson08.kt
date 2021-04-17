package goshadudar

fun main(args:Array<String>) {
    val user = MainProvider()
    user.printInfo(User())

    val user2 = MainProvider2()
    user2.printInfo(User())

    println(user.getConnection())

    println()
    check(user)




}

fun check (obj:MainProvider){
    if(obj is UserInfoProvider){
       obj.printInfo(User())
    }
    if (obj is DbConnection){
        obj.getConnection()
    }
    else println("Нет совпадений")
}
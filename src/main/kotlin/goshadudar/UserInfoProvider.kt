package goshadudar

// функции можно реализовывать и в интерфейсе

interface UserInfoProvider {
    val info: String

    fun printInfo(user: User) {
    println(info)
    user.printUser()
}
}

interface DbConnection{
    fun getConnection():String
}

open class MainProvider: UserInfoProvider,DbConnection {
    protected open val db = "Db connected"

    override val info: String
        get() = "Метод был вызван"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Дополнительный код")
    }

    override fun getConnection(): String {
        return db
    }

}

class MainProvider2: UserInfoProvider{
    override val info: String
        get() = "Метод был вызван у второго метода"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Дополнительный код второго метода")
    }

}
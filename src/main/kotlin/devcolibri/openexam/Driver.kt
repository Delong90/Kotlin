package devcolibri.openexam

class Driver(name: String): Person(name){

    override val age: Int = 2

    override val car: String = "YES"

    override fun getAddress(): String{
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(age='$age', name='$name')"
    }

}
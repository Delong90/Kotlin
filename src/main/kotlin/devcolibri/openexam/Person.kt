package devcolibri.openexam

open class Person (val name: String) {

    open val age:Int = 0
    open val car: String = "NO"

    open fun getAddress():String{
        return "Test"
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}
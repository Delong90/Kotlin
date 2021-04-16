package abstracts

open abstract class BaseTemplate {
    var count: Int = 0

    fun a(){
        count++
        println("COUNT: $count")
    }

   abstract fun minus()

}
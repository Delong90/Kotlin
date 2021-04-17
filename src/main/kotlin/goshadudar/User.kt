package goshadudar
// internal - видно только внутри модуля
// private - нигде не виден кроме этого класса
// protected - функция видна внутри этого класса и внутри классов наследников

class User(_firstName:String, _secondName:String){
    var login:String? = null
        set (value){
            if (value == "Codi")
            field = "NONE"
            else
                field = value
            println("Значение переменной: $field")
        }
    get() {
        val loginField = field ?: "Неизвестно"
        println("Переменная равна: $loginField")
        return field
    }

    var firstName: String = _firstName
    var secondName: String = _secondName

//    init{
//        firstName = _firstName
//        secondName= _secondName
//    }

    constructor(): this ("Peter","Patrik"){
        println("Данные были установлены")
    }
    constructor(firstName:String):this (firstName,"Patrikk"){
        println("Данные были установлены")
    }

    fun printUser(){
        println("$firstName $secondName")
    }
}



//class User{
//    var firstName = "Dima"
//    var secondName = "Petrov"
//
//    fun printUser(){
//        println(firstName)
//        println(secondName)
//    }
//}
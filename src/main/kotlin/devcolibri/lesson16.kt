package devcolibri

fun main(args: Array<String>){

    println(PersonTwo("Alex",24))

//    val person =  PersonTwo("Dima",35)
//    val person2 = person
//
//    person.age = 2
//
//
//    println(person)
//    println(person2)

    val person =  PersonTwo("Dima",35)
    val person2 = person.copy(age = 2)

    person.age = 5


    println(person)
    println(person2)


    var (age) = person


    println("My age = $age")


}
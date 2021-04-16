package devcolibri

import devcolibri.openexam.Driver
import devcolibri.openexam.Person

fun main(args: Array<String>){

    println(Person("Alex"))
    println(Driver("Ivan"))
    println(Person("Alex").getAddress())
    println(Driver("Dima").getAddress())


    var person = Person("Nikol")
    var driver = Driver("Stepan")

    println(person.getAddress())
    println(driver.getAddress())

    println(person)
    println(driver)

    println(person.car)
    println(driver.car)




}
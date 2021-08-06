package KotlinKoans

fun main(args:Array<String>) {

}
public class Address {
    public var name: String = "..."
    public var street: String = "..."
    public var city: String = "..."
    public var state: String? = "..."
    public var zip: String = "..."
}

fun copyAddress(address: Address): Address {
    val result = Address() // нет никакого слова `new`
    result.name = address.name // вызов методов доступа
    result.street = address.street
    // ...
    return result
}
package ex20220301

data class Person(
    val name: String, val age: Long, val postalCode: String
)

fun main() {
    val kim = Person(name="kim", age=56, postalCode = "11234")
    println(kim)
    println(kim.name)

    val(name:String, age:Long, postalCode:String) = kim
    println(age)
    println(postalCode)
    println(isPostalCodeValid(kim))
}

val isPostalCodeValid: (Person) -> Boolean = {
    person ->  person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
}
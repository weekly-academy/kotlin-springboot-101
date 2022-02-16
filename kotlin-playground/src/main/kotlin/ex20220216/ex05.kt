package ex20220216

/**
 * @Author Heli
 */
class Human(
    var firstName: String,
    var lastName: String,
    val age: Long,
    val address: String,
) {
    val fullName: String
        get() = "$firstName $lastName"
}

fun main() {
    val heli = Human(
        firstName = "Heli",
        lastName = "Academy",
        age = 20L,
        address = "서울"
    )

    println(heli.fullName)
    println(heli.age)
    println(heli.address)
}

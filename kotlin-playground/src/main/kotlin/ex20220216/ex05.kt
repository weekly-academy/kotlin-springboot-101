
class  Human(
    val firstName: String,
    val lastName: String,
    val age: Long,
    val address: String,
) {
    val fullNmae: String
        get() = "$firstName $lastName"
}

fun main() {
    val choi = Human(
        firstName = "Choi",
        lastName = "woong",
        age = 25,
        address = "서울"
    )
    println(choi.fullNmae)
    println(choi.age)
    println(choi.address)
}
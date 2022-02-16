package ex20220216

class Human(
    var firstName: String,
    var lastName: String,
    val age: Long,
    val address: String,
){
    val fullName: String
        get() = "$firstName + $lastName"
}

fun main(){
    val mini = Human(
        firstName = "Mini",
        lastName = "",
        age = 20L,
        address = "경기"
    )

    println(mini.fullName)
    println(mini.age)
    println(mini.address)
}
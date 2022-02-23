package ex20220223

/**
 * @Author Heli
 */
data class Person(
    val name: String,
    val age: Long,
    val postalCode: String
)

fun main() {
    // 사용자 입력, 양수인지 검사
    val input = 5
    if (input > 0) {
        // ..
    } else {
        // ...
    }

    val heli = Person(
        name = "heli",
        age = 9999L,
        postalCode = "12345"
    )

    println(heli.name)
    println(heli.age)
    println(heli.postalCode)

    val (name, age, postalCode) = heli
    println(name)
    println(age)
    println(postalCode)

    fun isPostalCodeValid(person: Person): Boolean {
        return person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
    }

    // lambda
    val isPostalCodeValidV2: (Person) -> Boolean = { person ->
        person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
    }

    if (heli.name.isNotEmpty() && heli.age > 0 && isPostalCodeValid(heli) && isPostalCodeValidV2(heli)) {
        // 복잡
    }
}

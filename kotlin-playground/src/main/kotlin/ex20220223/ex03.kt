package ex20220223

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
        //..
    }

    val mini = Person(
        name = "mini",
        age = 30,
        postalCode = "12345"
    )

    println(mini.name)
    println(mini.age)
    println(mini.postalCode)

    //구조분해 할당
    val (name: String, age: Long, postCode: String) = mini
    println(name)
    println(age)
    println(postCode)

    fun isPostalCodeValid(person: Person): Boolean {
        return person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
    }

    // lambda
    val isPostalCodeValid2: (Person) -> Boolean = { person ->
        person.postalCode.length == 5 && person.postalCode.all{ it.isDigit()}
    }

    if(mini.name.isNotEmpty() && mini.age > 0 && mini.postalCode.length == 5){
        //복잡
    }
}

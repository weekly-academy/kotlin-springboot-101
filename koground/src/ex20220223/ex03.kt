package ex20220223

// data 클래스는 일종의 POJO라고 보면 된다
// getter , setter 외에도 equals, toString 같은 메서드를 자동 생성..
// componentN() 메서드도 생성해주는데 이걸 통한 구조분해가 가능
// 스프레드처럼 발라먹는 거 가능


data class Person(
    val name: String,
    val age: Long,
    val postalCode: String,
//    var num: Int
// var 로 프로퍼티를 생성해도 생성자에는 val로 만들어짐
)

fun main() {

    val jp = Person(
        name = "JP",
        age = 1,
        postalCode = "11223"
    )
//    val (age,name,postalCode) = jp
//    println(age)
//    println(name)
//    println(postalCode)
    // 순서를 잘 지켜야 하는듯. .. . . ..

    val (name: String, age: Long, postalCode) = jp
    println(name)
    println(age)
    println(postalCode)

    fun isPostalCodeValid(person: Person): Boolean {
        return person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
    }
    // all == 모든 경우 만족하면 true 아니면 false

    val isPostalCodeValid2: (Person) -> Boolean = { person ->
        person.postalCode.length == 5 && person.postalCode.all { it.isDigit() }
    }

    if( jp.name.isNotEmpty() && jp.age > 0 && isPostalCodeValid(jp) && isPostalCodeValid2(jp)){
        println("true")
    }
}

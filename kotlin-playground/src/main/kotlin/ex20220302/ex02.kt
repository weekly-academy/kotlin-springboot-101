package ex20220302

class PersonLate {
    lateinit var name: String    // 지연 초기화 선언, 항상 var 타입

    fun test() {  // 프로퍼티 초기화 여부 판단
        if (!::name.isInitialized) {
            println("not isInitialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val person = PersonLate()
    person.test()         // not isInitialized
    println(person.name)  // Error
    person.name = "Heli"  // 이 시점에서 초기화됨
    person.test()         // initialized
}
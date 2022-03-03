package ex20220302

class PersonLate {
    // null 허용을 하지 않고 프로퍼티 초기화할 때 사용
    lateinit var name: String // 지연 초기화 선언, 항상 var 타입

    fun test() { // 프로퍼티 초기화 여부 판단
        if (!::name.isInitialized) { // :: 리플렉션
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val person = PersonLate()
    person.test()
//    println(person.name)
    person.name = "jp"
    person.test()
}
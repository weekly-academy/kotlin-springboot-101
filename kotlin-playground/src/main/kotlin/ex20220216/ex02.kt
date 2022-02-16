package ex20220216

/**
 * @Author Heli
 */
fun main() {
    /* 컴파일러가 컴파일 타임에 타입 추론을 통해 타입을 알아낸다 */
    val i = 10    // Int
    val s = "str" // String

    val l1 = 10L
    val l2: Long = 10 // 타입을 명시할 수도 있음

    // val => value
    // 변경 불가 immutable
    val name: String = "Heli"
    println(name)

    // var => variable
    // 변경 가능 mutable
    var name2: String = "Heli"
    println(name2)
    name2 = "Jek"
    println(name2)

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList)

    arrayList.add(5)
    arrayList += 6

    println(arrayList)
}

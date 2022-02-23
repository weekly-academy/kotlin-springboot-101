package ex20220216

fun main() {

    // 컴파일러가 컴파일 타입에 타입 추론을 통해 타입을 알아 낸다.
    var i = 10
    val s = "str"

    val l1 = 10L
    val l2 : Long = 10

    //  val => value 변경 불가능(Immutable)
    val name: String = "Choi"

    // var => variable 변경 가능(Mutable)
    var name2 = "choi"
    println(name2)
    name2 = "koo9"
    println(name2)

    val array = arrayListOf(1, 2, 3)
    array.add(5)
}

fun sum(one: Int, two: Int) = one + two
package ex20220216

fun main() {
    /*컴파일러가 컴파일 타임에 타입 추론을 통해 타입을 알아낸다*/
    val i = 10
    val s = "str"

    val l1 = 10L
    val l2: Long = 10  // 타입을 명시할 수도 있음

    // val => value
    // 변경불가, immutable
    val name: String = "Mini"
    println(name)

    //var => variable
    //변경 가능 mutable
    var name2: String = "Mini"
    println(name2)
    name2 = "Heli"
    println(name2)

    //변수에 세팅된 참조값을 변경할 수 없는 것이기 때문에, 참조가 가르키는 객체의 내용은 변경할 수 있습니다.
    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList)
    arrayList.add(5)
    arrayList += 6
    println(arrayList)
}

fun sum(one: Int, two: Int) = one + two
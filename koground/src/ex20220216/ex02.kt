package ex20220216

fun main(){
    val i = 10
    val s = "String"

    val l1 = 10L
    val l2:Long = 10

    val name: String ="JP"
    // val 은 immutable, 변경 불가!

    var name2: String = "jpjp"
    name2 = "JP"

    val arrayList = arrayListOf<Int>(1,2,3)
    arrayList.add(5)
    arrayList.add(4)
    arrayList += 6

    println(i)
    println(s)
    println(l1)
    println(l2)
    println(name)
    println(name2)
    println(name == name2)
    println(arrayList)
}

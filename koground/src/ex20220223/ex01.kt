package ex20220223

fun main() {
    val someList = arrayOf("a", "b", "c")

    printList(*someList) // 애스터리스크
}

fun printList(vararg Strings: String) {
    Strings.forEach {
        println(it) // it은 foreach문에 해당 인덱스의 it을 의미하는 듯
    }
}

// 자바에서는 String.. 이렇게 썻던거같은데
// 코틀린에서는 vararg 로 하는 듯!


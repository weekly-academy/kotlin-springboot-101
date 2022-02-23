package ex20220223

/**
 * @Author Heli
 */
fun main() {
    val someList = arrayOf("a", "b", "c")

    printList(*someList)
}

fun printList(vararg elements: String) {
    elements.forEach {
        println(it)
    }
}

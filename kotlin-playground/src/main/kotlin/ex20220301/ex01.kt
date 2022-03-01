package ex20220301

fun main() {
    val someList = arrayOf("a", "b", "c")
    printList(*someList)
}

fun printList(vararg elements: String) {
    elements.forEach { println(it) }
}
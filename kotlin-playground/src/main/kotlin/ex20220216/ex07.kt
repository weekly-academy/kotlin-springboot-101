package ex20220216

/**
 * @Author Heli
 */
fun main() {
    printCase("테스트")
    printCase(5L)
}

fun printCase(x: Any) {
    if (x is String) {
        println("문자열")
    } else if (x is Long) {
        println("정수")
    }
}

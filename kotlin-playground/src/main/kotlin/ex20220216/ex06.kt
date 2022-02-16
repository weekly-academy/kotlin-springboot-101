package ex20220216

/**
 * @Author Heli
 */
enum class Color {
    RED, YELLOW, BLUE, GREEN;

    fun print() = println("출력")
}

fun main() {
    val color = Color.GREEN

    color.print()

    val result = when (color) {
        Color.RED -> "빨강"
        Color.YELLOW -> "노랑"
        Color.BLUE -> "파랑"
        Color.GREEN -> "초록"
    }
    println(result)
}

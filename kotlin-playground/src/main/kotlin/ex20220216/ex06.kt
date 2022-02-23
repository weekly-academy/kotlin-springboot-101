import jdk.swing.interop.SwingInterOpUtils

enum class  Color {
    RED, YELLOW, BLUE, GREEN
}

fun main() {
    val color = Color.BLUE

    val result = when(color) {
        Color.RED -> "빨"
        Color.YELLOW -> "노"
        Color.BLUE -> "파"
        Color.GREEN -> "초"
    }
    println(result)
}
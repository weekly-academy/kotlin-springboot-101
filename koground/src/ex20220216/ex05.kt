package ex20220216

enum class Color {
    RED,YELLOW,BLUE,PURPLE; // 이넘 뒤에는 ; 붙여줘야한다
    fun print() = println("출력")
}

fun main() {
    val color = Color.PURPLE
    color.print()

    val result = when (color) {
        Color.BLUE -> "블루"
        Color.RED -> "레드"
        Color.YELLOW -> "노랑"
        Color.PURPLE -> "보라"
    }
    println(result)


}
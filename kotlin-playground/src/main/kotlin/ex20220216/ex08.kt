package ex20220216

fun main() {
    for (i in 1..10) {
        println(i)
    }

    // 'a' <= ch <= 'z'
    for (ch in 'a'..'z') {
        println(ch)
    }

    // 1, 4, 7, 10
    for (i in 1..10 step 3) {
        println(i)
    }

    /* until은 끝자리 숫자를 제외함을 유의 */
    // 1 <= i < 5
    for (i in 1 until 5) { // step 사용 가능
        println(i)
    }

    // 5, 4, 3, 2, 1
    for (i in 5 downTo 1) { // step 사용 가능
        println(i)
    }

    /* iterable 객체를 통한 iteration */
    // 1, 2, 3, 4
    val numbers = listOf(1, 2, 3, 4)
    for (number in numbers) {
        println(number)
    }
}
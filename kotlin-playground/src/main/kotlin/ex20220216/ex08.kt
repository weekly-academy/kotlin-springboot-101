package ex20220216

/**
 * @Author Heli
 */
fun main() {
    for (i in 1..10) {
        println(i)
    }

    for (ch in 'a'..'z') {
        // 'a' <= ch <= 'z'
        println(ch)
    }

    for (i in 1..10 step 3) {
        // 1, 4, 7, 10
        println(i)
    }

    /* until은 끝자리 숫자를 제외함을 유의 */
    for (i in 1 until 5) { // step 사용 가능
        // 1 <= i < 5
        println(i)
    }

    for (i in 5 downTo 1) { // step 사용 가능
        // 5, 4, 3, 2, 1
        println(i)
    }

    /* iterable 객체를 통한 iteration */
    val numbers = listOf(1, 2, 3, 4)
    for (number in numbers) {
        // 1, 2, 3, 4
        println(number)
    }
}

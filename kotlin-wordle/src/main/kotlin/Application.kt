import domain.Environment
import domain.WordComparator

/**
 * @Author Heli
 */

fun main() {
    val wordComparator = WordComparator()

    val environment = Environment(wordComparator = wordComparator)

    while (!environment.isGameOver) {
        val input = readLine() ?: ""

        if (environment.isValid(input)) {
            environment.submit(input)
        }
    }
}

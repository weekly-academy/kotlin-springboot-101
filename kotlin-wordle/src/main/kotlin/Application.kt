import domain.Environment
import domain.WordComparator

/**
 * @Author Heli
 */

fun main() {
    val environment = Environment()
    val wordComparator = WordComparator()

    val system = "apple"
    val input = readLine() ?: ""

    if (environment.input(input)) {
        val greenLetters = wordComparator.greenLetters(input, system)
        val yellowLetters = wordComparator.yellowLetters(input, system)

        // TODO Mission(2022/02/23)
        // GreenLetter, YellowLetters Char (x) -> Index
        // apple(system) / april(user) -> 'p'(정답) 근데, green/yellow 둘 다 걸림
        // yellow 를 구할 때, green 인건 제외
        println(greenLetters)
        println(yellowLetters)
    }

}

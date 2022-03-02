package ex20220301

fun main() {
    val numberMaps = mutableMapOf(
        1 to "one", 7 to "seven", 53 to "fifty-three"
    )
    numberMaps[10] = "ten"
    numberMaps.forEach { (key, value) -> println("$key is $value") }
}
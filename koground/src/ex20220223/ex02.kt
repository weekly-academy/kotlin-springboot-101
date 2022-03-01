package ex20220223

fun main() {
    val numberMaps = mapOf<Int,String>(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four"
    )
    println(numberMaps.entries)
}
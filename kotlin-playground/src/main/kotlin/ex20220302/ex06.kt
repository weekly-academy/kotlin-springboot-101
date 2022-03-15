package ex20220302

class Point(val x: Int, val y: Int, val z: Int) {
    operator fun component1() = x
    operator fun component2() = y
    operator fun component3() = z
}

data class PersonV3(
    val name: String = "Heli",
    val age: Long = 99999L
)

fun main(){
    val (x, y, z) = Point(1, 2, 3)
    println("$x , $y $z")

    val pair = "a" to "one"

    val (a, one) = pair
    println("$a, $one")

    val triple = Triple("a", "one", "two")
    val (a1, b, c) = triple
    println("$a1, $b, $c")


}
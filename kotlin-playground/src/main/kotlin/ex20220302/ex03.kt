package ex20220302

/**
 * @Author Heli
 */
class LazyTest {
    lateinit var inputValue: String
    val x: Int by lazy { inputValue.length }
}

fun main() {
    val lazyTest = LazyTest()
    lazyTest.inputValue = "abc"
    println(lazyTest.x)
    lazyTest.inputValue = "abcdddddd"
    println(lazyTest.x)
}

package ex20220302

class LazyTest {
    lateinit var inputValue: String
    val x: Int by lazy {inputValue.length} //by 는 위임
    //
}

fun main() {
    val lazyTest = LazyTest()
    lazyTest.inputValue = "abc"
    println(lazyTest.x)
    lazyTest.inputValue = "abcdefgh"
    println(lazyTest.x)
}
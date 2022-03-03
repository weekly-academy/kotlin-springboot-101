package ex20220302

class LazyTest {
    lateinit var inputValue: String
    val x: Int by lazy {inputValue.length} //by 는 위임
    // by lazy = 호출시점에서 최초 1회 초기
    // by lazy 는 lateinit과 다르게 null 허용
}

fun main() {
    val lazyTest = LazyTest()
    lazyTest.inputValue = "abc"
    println(lazyTest.x)
    lazyTest.inputValue = "abcdefgh" //재초기화가 안됨
    println(lazyTest.x)
}
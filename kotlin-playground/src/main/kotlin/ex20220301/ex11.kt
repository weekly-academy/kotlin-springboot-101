package ex20220301

fun main() {
    val shop1 = Shop()
    shop1.sell()
}

open class Logger {
    fun log(message: String) {
        println(message)
    }
}

class Shop {
    private val logger = Logger()

    fun sell() {
        log("sell")
    }

    companion object: Logger()
}
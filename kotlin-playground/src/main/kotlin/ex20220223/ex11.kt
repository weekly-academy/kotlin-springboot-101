package ex20220223

/**
 * @Author Heli
 */
object Field {

}

class Shop {

    fun sell() {
        log("Sell")
        error("error")
    }

    companion object : Logger()
}

fun main() {
    val shop1 = Shop()
    val shop2 = Shop()
    val shop3 = Shop()
    val shop4 = Shop()
    val shop5 = Shop()
    val shop6 = Shop()
}


open class Logger {
    fun log(message: String) {
        println(message)
    }

    fun error(message: String) {
        println(message)
    }
}

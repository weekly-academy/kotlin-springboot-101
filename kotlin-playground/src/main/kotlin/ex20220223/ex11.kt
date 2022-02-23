package ex20220223

object Field {

}

class Shop {

    private val logger = Logger()

    fun sell() {
        log("Sell")
        error("error")
    }

    //static 으로 돌아간다
//    companion object {
//        private val logger = Logger()
//    }

    companion object: Logger()
}

open class Logger {
    fun log(message: String) {
        println(message)
    }
}

fun main(){
    val shop1 = Shop()
    val shop2 = Shop()
    val shop3 = Shop()
    val shop4 = Shop()
    val shop5 = Shop()
    val shop6 = Shop()
    val shop7 = Shop()
}
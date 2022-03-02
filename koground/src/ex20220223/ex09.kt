package ex20220223

// 코틀린에서 object로 클래스를 정의하면 싱글턴 패턴이 적용됨!

class Shop {
//    val logger = Logger()
    companion object : Logger() // companion object로 생성되어있기에
//    로그나 에러를 생성할때 객체를 생성한다음 프로퍼티 접근 안해도 됨!
// 약간 static import 느낌?

    fun sell() {
//        logger.log("sell")
//        logger.error("error")
        log("sell")
        error("error")
    }
}

open class Logger {
    fun log(message: String) {
        println(message)
    }
    fun error(message: String) {
        println(message)
    }
}

fun main() {
    val shop1 = Shop().sell()
    val shop2 = Shop().sell()
    val shop3 = Shop().sell()
    val shop4 = Shop().sell()
    val shop5 = Shop().sell()
    val shop6 = Shop().sell()
}
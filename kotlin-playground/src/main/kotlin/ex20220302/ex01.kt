package ex20220302

/**
 * @Author Heli
 */
fun main() {
    val s1: String? = null

    println(s1?.length)
    println(s1?.length ?: -1)

    val s2 = s1 as? String ?: "heli"
    println(s2)

    val s3: String? = null

//    println(s3!!.length)

    val s4: String? = "heli2222"
    s4?.let {
        printMessage(it)
    }
}

fun printMessage(str: String) {
    println(str)
}

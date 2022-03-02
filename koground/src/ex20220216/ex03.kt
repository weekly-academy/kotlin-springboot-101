package ex20220216

fun main(){
    val number = 0
    println(isZeroVersionJava(number))
    println(isZeroVersionKotlin(number))
    println(isZeroVersionKotlin2(number))
    println(whenKotloin(number))
}

fun isZeroVersionJava(number: Int): Boolean {
    if (number == 0) {
        return true
    }
    return false
}

fun isZeroVersionKotlin(number: Int):Boolean {
    val result = if (number == 0) {
        true
    } else {
        false
    }
    return result
}

fun isZeroVersionKotlin2(number: Int) = (number == 0)
fun whenKotloin(number: Int) : Boolean {
    val result = when (number) {
        1 -> true
        2 -> false
        3 -> true
        4 -> false
        5 -> true
        else -> false
    }
    return result
}




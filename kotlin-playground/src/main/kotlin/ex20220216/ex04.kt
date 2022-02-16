package ex20220216

fun main() {

    val number = 5;

    println(isZeroVerJava(number))
    println(isZeroVerKotlin(number))
    println(isZeroVerKotlin2(number))
}

fun isZeroVerJava(number: Int): Boolean {
    if (number == 0) {
        return true
    }

    return false
}

fun isZeroVerKotlin(number: Int): Boolean {
    val result =  if (number == 0) {
        println("true block")
        return true
    } else {
        println("false block")
        return false
    }
    return result
}

fun isZeroVerKotlin2(number: Int) = (number == 0)

fun whenKotlin(number: Int): Boolean {
    val result = when(number) {
        1 -> true
        2 -> false
        else -> false
    }
    return result
}
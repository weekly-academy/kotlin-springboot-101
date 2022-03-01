package ex20220216

fun main() {
    for(i in 1..10){
        println(i) // 1 부터 10
    }
    for(ch in 'a'..'z'){
        println(ch) // a부터z까지
    }
    for(i in 1..10 step 3) {
        println(i) // 1 ,4,7,10
    }
    for(i in 1 until 13) {
        println(i)// 1부터 13전까지
    }
    for(i in 5 downTo 1) {
        println(i) // 5,4,3,2,1
    }

    val numbers = listOf<Int>(1,2,3,4)
    for(number in numbers) {
        println(number)
    }
}
package ex20220216

fun main() {
    printCase("테스트")
    printCase(5L)
}

fun printCase(x: Any) {
    // Any 타입은 왠만하면 안쓰는게 좋을 것 같다...
    if( x is String) {
        println("문자열")
    }else if( x is Long) {
        println("정수")
    }
}
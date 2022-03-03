package ex20220302

fun main() {
    val s1: String? = null

    println(s1?.length)
    println(s1?.length ?: -1)

    val s2 = s1 as? String ?: "jp" //"as?" 연산자는 어떤 값을 지정한 타입으로 캐스트를 하고, 만약 대상 타입으로 캐스트 할 수 없으면 null을 반환
    println(s2)

    val s3: String? = null
    println(s3)

//    val a = s3!!
//    println(a) // null 은 !! 연산자 앞에 쓰면 컴파일 단계에서 에러 발생!

    val s4: String? = "jpjpjp"
    // ?.let{}   를 사용하면 null이 되는 식을 쉽게 다룰 수 있음
    // null 이 아닌 경우에만 아래 식 실행
    s4?.let {
        printMesssage(it)
    }
    val s5 = null
    s5?.let {
        printMesssage(it)
    }
}

fun printMesssage(str: String) {
    println(str)
}
package ex20220302

fun main(){
    val s1: String? = null

    println(s1?.length)
    println(s1?.length ?: -1)  //evlis 연산자

    val s2 : String = s1 as? String ?: "heli"
    println(s2)

    //이런식으로 사용하지 마라
    val s3: String? = null
//    println(s3!!.length)

    //if 로 null 체크하기 보다는 let을 써보자
    val s4: String? = "heli222"
    s4?.let{
        printMessage(it)
    }
}

fun printMessage(str: String){
    println(str)
}
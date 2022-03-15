package ex20220302

import TestJavaPlatform

fun main(){
    val testJavaPlatform = TestJavaPlatform()
    println(testJavaPlatform.name.length)    //java 에서 선언된것은 nullable 인지 아닌지 알 수 없어서 NPE

    //!가 붙어있으면 플랫폼 타임
}
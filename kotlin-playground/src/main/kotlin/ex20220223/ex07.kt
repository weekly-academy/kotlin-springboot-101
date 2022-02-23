package ex20220223

class OuterClass{
    val parent = "parent"

    class Normal{
        val normal = "normal"
    }

    inner class Inner{
        val inner = "inner"
    }
}

fun main(){
    val outerClass = OuterClass()
    println(outerClass.parent)

    val normal = OuterClass.Normal()
    println(normal.normal)

    //OuterClass.Inner() 는 접근 불가... (메모리 관점의 차이...-> 찾아보기)
    val inner = outerClass.Inner()
    println(inner.inner)
}
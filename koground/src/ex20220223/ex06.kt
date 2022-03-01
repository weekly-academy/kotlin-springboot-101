package ex20220223

class Outer{
    val parent = "parent"
    class Normal {
        val normal = "normal"
    }
    inner class Inner {
        val inner = " inner "
    }
}


fun main () {
    val outerClass = Outer()
    val normal = Outer.Normal()
//    val inner = Outer.Inner() //이너클래스는 외부 클래스로만 호출 가능한듯!
    println(outerClass.parent)
    println(outerClass.Inner().inner)
    println(outerClass.Inner().inner)
    println(normal.normal)
    println(outerClass.parent)
}
package ex20220301

fun main() {

    val outerClass = OuterClass()
    println(outerClass.parent)

    val normal = OuterClass.Normal()
    println(normal.normal)

    // can't call inner class from out of class
//    val inner = OuterClass.Inner()
//    println(inner.inner)

}

class OuterClass {
    val parent = "parent"
//    val inner = Inner() // can call inner class only here

    class Normal {
        val normal = "normal"

    }
    inner class Inner {

        val inner = "inner"
    }
}
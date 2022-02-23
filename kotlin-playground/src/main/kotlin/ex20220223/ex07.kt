package ex20220223

/**
 * @Author Heli
 */
class OuterClass {
    val parent = "parent"

    class Normal {
        val normal = "normal"
    }

    inner class Inner {
        val inner = "inner"
    }
}

fun main() {
    val outerClass = OuterClass()
    println(outerClass.parent)

    val normal = OuterClass.Normal()
    println(normal.normal)

    val inner = outerClass.Inner()
    println(inner.inner)
}

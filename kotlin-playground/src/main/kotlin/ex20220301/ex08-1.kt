package ex20220301

fun main() {

    val apple = Apple(name = "bbbb")
    println(apple.name)
    println(apple.getAge())

    val a = Apple(age = 99)
    println(a.name)
    println(a.getAge())
}

sealed class Fruit1 {
    abstract val name: String
}

class Apple(override val name: String) : Fruit1() {
    private var age:Int = 0

    constructor(age: Int) : this(name="test") {
        this.age = age
    }

    fun getAge():Int {
        return this.age
    }
}
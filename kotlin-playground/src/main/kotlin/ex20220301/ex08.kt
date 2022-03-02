package ex20220301

fun main() {

    val apple = Fruit.Apple(name = "aaaa")
    println(apple.name)
    println(apple.getAge())

    val a = Fruit.Apple(age = 10)
    println(a.name)
    println(a.getAge())
}

sealed class Fruit {
    abstract val name: String

    class Apple(override val name: String) : Fruit() {
        private var age:Int = 0

        constructor(age: Int) : this(name="test") {
            this.age = age
        }

        fun getAge():Int {
            return this.age
        }
    }
    class Banana (override val name: String): Fruit() {

    }
}
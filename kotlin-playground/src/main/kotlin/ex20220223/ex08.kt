package ex20220223

/**
 * @Author Heli
 */
sealed class Fruit {
    abstract val name: String

    class Apple(
        override val name: String
    ) : Fruit() {
        private var age: Int = 0

        constructor(_age: Int) : this(name = "") {
            this.age = _age
        }
    }

    class Banana(
        override val name: String
    ) : Fruit()
}

class AppleV2(override val name: String) : Fruit()

package ex20220223

// sealed 클래스? 확장이 제한된 클래스.
// 공통된 속성을 묶어주기 위한..abstract class의 개념과 비슷
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
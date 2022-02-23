package ex20220223

//sealed class 는 abstract class -> 혼자 생성 불가능, 공통 타입을 묶어서 사용한다.
sealed class Fruit {
    abstract val name: String

    class Apple(override val name: String) : Fruit() {
        //보조 생성자도 만들 수 있다.
        private var age: Int = 0

        constructor(age: Int) : this(name = "") {
            this.age = age
        }
    }

    class Banana(
        override val name: String
    ) : Fruit()
}

class AppleV2(override val name: String) : Fruit()
package ex20220223

fun main() {
    val jp = Student()
    jp.walk()
}

interface Animal {
    fun walk()
}

interface Human {
    fun walk() = println("사람이 걷는다")
}

class Student : Animal, Human {
//    override fun walk() {
//        super<Human>.walk()
//    }
     override fun walk() = super<Human>.walk() // 이게 더 보기 좋다
}
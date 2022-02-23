package ex20220223

/**
 * @Author Heli
 */
interface Animal {
    // interface는 상태 필드를 가질 수 없다.
    fun walk() = println("Walking on 4 legs") // default method
}

interface Human {
    fun walk() = println("Walking on 2 legs")
}

class Student : Animal, Human {
    override fun walk() = super<Human>.walk()
}

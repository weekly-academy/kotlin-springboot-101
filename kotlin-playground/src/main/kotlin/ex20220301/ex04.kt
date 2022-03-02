package ex20220301

fun main() {
    val student = Student()
    student.walk()
}

interface Animal {
    fun walk() = println("animal can walk")
}

interface Human {
    fun walk() = println("human walk ")
}

class Student: Animal, Human {
    override fun walk() {
        super<Human>.walk()
    }
}
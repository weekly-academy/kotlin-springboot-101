package ex20220223

interface Animal {
    fun walk() = println("Animal's walk")
}

interface Human {
    fun walk() = println("Human's walk")
}

class Student : Animal, Human {
    override fun walk() = super<Human>.walk()
}

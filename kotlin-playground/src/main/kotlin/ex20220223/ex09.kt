package ex20220223


open class Person2 {
//    private val name: String
//    private val age: Int
    val name: String
    val age: Int

    constructor(name: String) {
        this.name = name
        age = 0
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

class Worker(
    name: String,
    age: Int
) : Person2(name, age)

fun main() {
    val worker = Worker(name = "Mini", age = 30)
    println(worker.name)
    println(worker.age)
}


package ex20220301

fun main() {

    val worker = Worker(name = "kim", age = 56)
    println(worker.name)
    println(worker.age)
}

open class Person2 {
    val name: String
    val age: Int

    constructor(name: String) {
        this.name = name
        this.age = 0
    }

    //overloading?
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

class Worker(name: String, age: Int) : Person2(name, age)
package ex20220223

open class PersonV2 {
    val name: String
    val age: Int

    constructor(name: String) {
        this.name = name
        this.age = 0
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

class Worker(
    name: String,
    age: Int
) : PersonV2(name, age) {

}

fun main() {
    val worker = Worker(name="JP", age = 0)
    println(worker.name)
    println(worker.age)
}
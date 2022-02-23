package ex20220223

/**
 * @Author Heli
 */
// constructor를 사용해 부 생성자 작성
open class PersonV2 {
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
) : PersonV2(name, age) {

}

fun main() {
    val worker = Worker(name = "Heli", age = 9999)
    println(worker.name)
    println(worker.age)
}

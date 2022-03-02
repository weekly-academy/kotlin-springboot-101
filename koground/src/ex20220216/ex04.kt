package ex20220216

fun main(){
    val jp = Human(
        firstName = "jp",
        lastName = "W",
        age = 20,
        address = "home"
    )
    val jp2 = Human(
        age = 20,
        address = "home",
        lastName = "W",
        firstName = "jp"
    )
    //생성자에 넘기는 값 위치가 달라도 위에처럼 값을 지정해주면 파람 위치 상관없음
    val JP = Human("jp","W",20,"HOME")
//    val JP2 = Human(20,"jp","W","HOME")
    println(JP.fullName)
    println(jp.fullName)
    println(jp2.firstName)
    println(jp2.lastName)
    println(jp2.age)
    println(jp2.address)

}

class Human(
    var firstName: String,
    var lastName: String,
    val age: Long,
    val address: String,
    ){
    val fullName: String
        get() ="$firstName $lastName"
}



package ex20220302

import kotlin.properties.Delegates

class UserV2 {
    // "<no name>"은 디폴트 값
    var name: String by Delegates.observable("<no name>") {
        // lambda의 첫번째 파라미터( prop )는 일단 무시
        // 이해를 돕기 위해 2, 3번째 파라미터만 설명
        prop, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main(){

    val user = UserV2()
    user.name = "first"
    user.name = "second"

    /* stdout */
    // <no name> -> first
    // first -> second
}
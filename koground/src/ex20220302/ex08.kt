package ex20220302

import kotlin.properties.Delegates

class UserV2 {
    // observerble : 어떤 값이 어떻게 변했는지 알고 싶을 때 사용
    // 값이 변경될 때 마다 콜백 받는 것 가능
    var name: String by Delegates.observable("<no name>") { prop, oldValue, newValue ->
        println("$prop, $oldValue -> $newValue")
    }
}

fun main() {
    val user = UserV2()
    user.name = "first"
    user.name = "second"
}
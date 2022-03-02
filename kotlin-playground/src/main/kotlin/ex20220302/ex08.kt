package ex20220302

import kotlin.properties.Delegates

/**
 * @Author Heli
 */


class UserV2 {
    // "<no name>"은 디폴트 값
    var name: String by Delegates.observable("<no name>") { prop, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    val user = UserV2()
    user.name = "first"
    user.name = "second"
}

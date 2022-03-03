package ex20220302

import kotlin.reflect.KProperty

class Delegate {
    private lateinit var value: String
    operator fun getValue(userRef: User, property: KProperty<*>): String {
        println("getValue 1" + userRef)
        println("getValue 2" + property)
        return value
    }

    operator fun setValue(userRef: User, property: KProperty<*>, value: String) {
        this.value = value
        println("setvalue 먼저 ! $userRef - ${property.name} = $value")
    }
}

class User {
    var uName: String by Delegate()
    val sName: String by lazy {
        println(uName)
        uName
    }
}

fun main() {
    val user = User()
    user.uName = "jp"
    println(user.uName)
}
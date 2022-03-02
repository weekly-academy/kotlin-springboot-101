package ex20220302

import kotlin.reflect.KProperty

/**
 * @Author Heli
 */

/**
 * @param thisRef        User 객체의 레퍼런스
 * @prarm property.name  User 클래스의 호출된 필드 이름( uName )
 * @param value          User 클래스 필드에 세팅될 값( "tassadar" )
 */
class Delegate {
    private lateinit var value: String
    operator fun getValue(userRef: User, property: KProperty<*>): String {
        println(userRef)
        println(property)
        return value
    }

    operator fun setValue(userRef: User, property: KProperty<*>, value: String) {
        this.value = value
        println("$userRef - ${property.name} = $value")
    }
}

/* uName 필드는 위임 프로퍼티 */
class User {
    var uName: String by Delegate()
    val sName: String by lazy {
        println(uName)
        uName
    }
}

fun main() {

    val user = User()
    /* Delegate 클래스에 위임된 필드인 uName 접근 */

    user.uName = "Heli" // Delegate.setValue() 호출
    println(user.uName) // Delegate.getValue() 호출

}

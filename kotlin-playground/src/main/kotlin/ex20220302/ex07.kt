package ex20220302

import kotlin.reflect.KProperty

class Delegate {
    private lateinit var value:String
    operator fun getValue(userRef: User, property: KProperty<*>): String {
        return "Default Value"
    }

    operator fun setValue(userRef: User, property: KProperty<*>, value: String) {
        println("$userRef - ${property.name} = $value")
    }
}

/* uName 필드는 위임 프로퍼티 */
class User {
    var uName: String by Delegate()
}


fun main(){
/* Delegate 클래스에 위임된 필드인 uName 접근 */
    val user = User()
    println(user.uName) // Delegate.getValue() 호출
    user.uName = "tassadar" // Delegate.setValue() 호출
}

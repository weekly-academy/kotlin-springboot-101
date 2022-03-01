package ex20220223

fun main() {
    val project = Project()
    val module = Module()
    println(project.title)
    println(module.title)
}

open class IntelliJ {
    open val title = "intellij"
    var content = "something..."
}

open class Project : IntelliJ() {
    override val title = "Project"
//    override var content = "???"
}

class Module : Project() {
    override val title = "Module"
}

// 코틀린은 기본적으로 다 닫혀있음
// 상속을 가능케 하려면 open class로 선언해야함
// open으로 선언안된 프로퍼티는 상속이 불가능

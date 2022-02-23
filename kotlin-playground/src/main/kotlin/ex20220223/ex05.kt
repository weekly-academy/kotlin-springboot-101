package ex20220223

/**
 * @Author Heli
 */
open class IntelliJ {
    open val title = "IntelliJ"
    var content = "somethingContent"
}

open class Project : IntelliJ() {
    override val title = "Project"
}

class Module : Project() {
    override val title = "Module"
}

package ex20220301

fun main() {
    val intellij = Intellij()
    println(intellij.title)
    val module = Module()
    println(module.title)
}

open class Intellij {
    open val title = "intellij title"
    val content = "need License"
}

open class Project: Intellij() {
    override val title = "project title"
}

class Module: Project() {
    override val title = "module title"
}
package ex20220223

//kotlin byte code 로 decompile 해서 결과를 보면 좋아요
open class IntelliJ {
    open val title = "IntelliJ"
    var conent = "somethingContent"
}

open class Project : IntelliJ(){
//    final override val title = "Project"  //더이상 아래로 상속 불가
    override val title = "Project"
}

class Module: Project(){
    override val title = "Module"
}
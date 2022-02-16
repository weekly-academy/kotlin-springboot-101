package ex20220216

fun main(){
    val result = try{
        println("test")
        throw Exception()
    }catch(e: Exception){
        println("에러 발생")
        "실패했음"
    }finally {
        println("종료")
    }

    var result2: String
    try{
        println("test")
        result2 = "성공했음"
    }catch (e: Exception){
        println("에러 발생")
        result2 = "실패했음"
    }
    println(result)
}
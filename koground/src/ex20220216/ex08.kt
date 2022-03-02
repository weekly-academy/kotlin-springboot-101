package ex20220216

fun main() {
    val result = try {
        println("test1")
        throw Exception()
    } catch (e: Exception) {
        println("test1 에러 발생")
        "test1 실패했음!!!!"
        "뭐지..."
        1+2
        //이곳의 값들이 왜 콘솔에 직히는걸까?
    } finally {
        println("test1 종료!")
    }

    var result2: String
    try {
        println("test2")
        result2 = "test2 성공했다"
    } catch(e:Exception) {
        println(" test2 에러 발생")
        result2 = "test2 실패했다..."
    }
    println(result)
    println(result2)
}
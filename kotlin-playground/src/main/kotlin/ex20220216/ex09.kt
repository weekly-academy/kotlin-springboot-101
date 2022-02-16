fun main() {
    try {
        println("hello")
        throw Exception()
    } catch (e : Exception) {
        println("에러")
    } finally {
        println("종료")
    }
}
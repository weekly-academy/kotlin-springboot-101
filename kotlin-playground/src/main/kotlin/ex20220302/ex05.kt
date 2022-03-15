package ex20220302

//plus 함수 정의는 '+' 연산자 오버로딩을 의미한다.
data class Point1(val x: Int, val y: Int){
    operator fun plus(other: Point1): Point1{
        return Point1(x + other.x, y + other.y)
    }
}

fun main(){
    // 다음과 같이 사용이 가능하다.
    val point1 = Point1(1, 1) + Point1 (2, 2)

    //컴파일시 plus 함수를 호출하는 것과 같이 변환이 된다.
    val point2 = Point1(1, 1).plus(Point1(2,2))
}
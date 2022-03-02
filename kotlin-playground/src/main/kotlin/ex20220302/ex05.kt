package ex20220302

/**
 * @Author Heli
 */
/* plus 함수 정의는 '+' 연산자 오버로딩을 의미한다 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {

    /* 다음과 같이 사용 가능 */
    val point1 = Point(1, 1) + Point(2, 2) // -> Point(3, 3)

    /* 컴파일시, plus 함수를 호출하는 것과 같이 변환됨 */
    val point2 = Point(1, 1).plus(Point(2, 2))
}

package ex20220302

data class Point(val x: Int, val y: Int) {
    // 연산자 오버라이딩을 하기 위해서는 operator fun 사용
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val point1 = Point(1,1) + Point(2,2)
    val point2 = Point(1,1).plus(Point(2,2))
    println(point1)
    println(point2)
}
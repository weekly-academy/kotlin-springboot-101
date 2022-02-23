package domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @Author Heli
 */
class EnvironmentTest {

    @Test
    fun `게임 시작 시 시도 회수는 0회로 시작한다`() {
        // 환경을 관리하는 클래스
        val environment = Environment()

        val actual = environment.tryCount

        Assertions.assertEquals(0L, actual)
    }

    @Test
    fun `정답 제출 시 시도 회수가 1씩 증가한다`() {
        val environment = Environment()

        environment.submit()
        val actual = environment.tryCount

        Assertions.assertEquals(1L, actual)
    }

    @Test
    fun `정답 제출은 6번까지 할 수 있다`() {
        val environment = Environment()

        (1..7).forEach { _ ->
            environment.submit()
        }
        val actual = environment.isGameOver

        Assertions.assertEquals(true, actual)
    }

    @Test
    fun `5글자로 이루어진 단어를 입력할 수 있다`() {
        val environment = Environment()

        val actual = environment.input("apple")

        Assertions.assertEquals(true, actual)
    }

    @Test
    fun `4글자로 이루어진 단어는 입력할 수 없다`() {
        val environment = Environment()

        val actual = environment.input("abcd")

        Assertions.assertEquals(false, actual)
    }

    @Test
    fun `6글자로 이루어진 단어는 입력할 수 없다`() {
        val environment = Environment()

        val actual = environment.input("abcdef")

        Assertions.assertEquals(false, actual)

    }
}

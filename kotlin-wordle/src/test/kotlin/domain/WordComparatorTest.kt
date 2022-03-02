package domain

import domain.CompareStatus.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * @Author Heli
 */
class WordComparatorTest {

    @Test
    fun `입력한 단어와 정답 단어가 완전히 일치하면 정답이다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.compare("apple", "apple")
        // CORRECT, ABSENT, NONE

        // then
        assertThat(actual).containsExactly(CORRECT, CORRECT, CORRECT, CORRECT, CORRECT)
    }

    @Test
    fun `정답 단어에 입력한 단어의 글자가 포함되고 위치가 같지 않으면 ABSENT 를 반환한다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.compare("apple", "april")
        // CORRECT, ABSENT, NONE

        // then
        assertThat(actual[2]).isEqualTo(ABSENT)
        assertThat(actual[3]).isEqualTo(ABSENT)
    }

    @Test
    fun `정답 단어에 입력한 단어의 글자가 포함되지 않으면 NONE 을 반환한다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.compare("apple", "april")
        // CORRECT, ABSENT, NONE

        // then
        assertThat(actual[4]).isEqualTo(NONE)
    }
}

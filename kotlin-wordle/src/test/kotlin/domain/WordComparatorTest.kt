package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
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
        val actual = comparator.isEquals("apple", "apple")

        // then
        Assertions.assertEquals(true, actual)
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되고 위치가 같은 글자를 찾을 수 있다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.greenLetters("apple", "april")

        // then
        assertThat(actual).containsExactly('a', 'p')
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되지만 위치가 같지 않은 글자를 찾을 수 있다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.yellowLetters("april", "apple")

        // then
        assertThat(actual).containsExactly('p', 'l')
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되지만 위치가 같지 않은 글자를 찾을 수 있다2`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.yellowLetters("apple", "april")

        // then
        assertThat(actual).containsExactly('p', 'l')
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에서 포함되지 않는 글자를 찾을 수 있다`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.grayLetters("apple", "april")

        // then
        assertThat(actual).containsExactly('e')
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에서 포함되지 않는 글자를 찾을 수 있다2`() {
        // given
        val comparator = WordComparator()

        // when
        val actual = comparator.grayLetters("april", "apple")

        // then
        assertThat(actual).containsExactly('r', 'i')
    }
}

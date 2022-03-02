package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WordComparatorTest {

    @Test
    fun `입력한 단어와 정답 단어가 완전히 일치하면 정답이다`() {
        //given
        val comparator = WordComparator()
        //when
        val actual = comparator.isEquals("abcde", "abcde")
        //then
        Assertions.assertEquals(true, actual)

    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되고 위치가 같으면 초록색으로 표시한다`() {
        //given
        val comparator = WordComparator()
        //when
        val actual = comparator.greenLetters("apple", "april")
        //then
        assertThat(actual).containsExactly('a', 'p')
    }

    @Test
    fun `입력한 단어의 글자 중에서 정답단어에 포함되지만 위치가 같지 않으면 노랑색으로 표시한다`() {
        //given
        val comparator = WordComparator()
        //when
        val actual = comparator.yellowLetters("apple", "april")
        //then
        assertThat(actual).containsExactly('p', 'l')
    }

    @Test
    fun `입력한 단어의 글자중에서 정답단어에 포함되지 않으면 회색으로 표시한다`() {
        val comparator = WordComparator()
        //when
        val actual = comparator.grayLetters("qwert", "asdfg")
        //then
        assertThat(actual).containsExactly()
    }

}
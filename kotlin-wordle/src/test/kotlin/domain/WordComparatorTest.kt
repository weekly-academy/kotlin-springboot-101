package domain

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
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되고 위치가 같은 글자를 찾을 수 있다`() {
        //given
        val comparator = WordComparator()
        //when
        val actual = comparator.greenLetters("apple","april")
        //then
        org.assertj.core.api.Assertions.assertThat(actual).containsExactly('a','p')


    }

    @Test
    fun `입력한 단어의 글자 중에서 정답 단어에 포함되지만 위치가 같지 않은 글자를 찾을 수 있다`() {
        //given
        val comparator = WordComparator()
        //when
        val actual = comparator.yellowLetters("apple","april")
        //then
        org.assertj.core.api.Assertions.assertThat(actual).containsExactly('p','l')

    }

    @Test
    fun `정답 단어에 입력한 단어의 글자가 포함되지 않으면 회색을 표시한다`() {
        val comparator = WordComparator()
        //when
        val actual = comparator.grayLetters("qwert","asdfg")
        //then
        org.assertj.core.api.Assertions.assertThat(actual).containsExactly()


    }
}
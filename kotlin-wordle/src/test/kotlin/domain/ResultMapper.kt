package domain

import java.lang.IllegalArgumentException

class ResultMapperTest {

    @Test
    fun `CORRECT 인 경우 녹색을 표시한다`() {
        // when
        val actual = ResultMapper.mapColor(CORRECT, CORRECT, CORRECT, CORRECT, CORRECT)

        // then
        assertThat(actual).isEqualTo("🟩🟩🟩🟩🟩")
    }

    @Test
    fun `ABSENT 인 경우 노란색 표시한다`() {
        // when
        val actual = ResultMapper.mapColor(ABSENT, ABSENT, ABSENT, ABSENT, ABSENT)

        // then
        assertThat(actual).isEqualTo("🟨🟨🟨🟨🟨")
    }

    @Test
    fun `NONE 인 경우 회색 표시한다`() {
        // when
        val actual = ResultMapper.mapColor(NONE, NONE, NONE, NONE, NONE)

        // then
        assertThat(actual).isEqualTo("⬜️⬜️⬜️⬜️⬜️")
    }
}
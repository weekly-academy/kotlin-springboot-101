package domain

object ResultMapper {

    private val resultColoMap = mapOf(
        CompareStatus.CORRECT to "🟩",
        CompareStatus.ABSENT to "🟨"
    )

    fun mapColor(vararg status: CompareStatus) = status.joinToString("") { resultColoMap[it] ?: "⬜️" }
}

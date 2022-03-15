package domain

object ResultMapper {
    private val resultColoMap = mapOf(
        CompareStatus.CORRECT to "\uD83D\uDFE9",
        CompareStatus.ABSENT to "🟨"
    )

    fun mapColor(vararg status: CompareStatus) = status.joinToString("") { resultColoMap[it] ?: "⬜️" }
}
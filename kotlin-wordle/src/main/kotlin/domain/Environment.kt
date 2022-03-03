package domain

class Environment(
    private val wordComparator: WordComparator,
) {

    private val system = "apple"

    var tryCount: Long = 1L
        private set

    val isGameOver: Boolean
        get() = tryCount > GAME_OVER_TRY_COUNT

    fun submit(input: String, block: (String) -> Unit = ::println) {
        tryCount += 1
        val compareResult = wordComparator.compare(input, system)
        block(ResultMapper.mapColor(*compareResult.toTypedArray()))
    }

    fun isValid(userInput: String) = userInput.length == 5

    companion object {
        private const val GAME_OVER_TRY_COUNT = 6L
    }
}
package domain

class Environment {

    var tryCount: Long = 0L
        private set

    val isGameOver: Boolean
        get() = tryCount > GAME_OVER_TRY_COUNT

    fun submit() {
        tryCount += 1
    }

    fun input(userInput: String) = userInput.length == 5

    companion object{
        private const val GAME_OVER_TRY_COUNT = 6L
    }
}
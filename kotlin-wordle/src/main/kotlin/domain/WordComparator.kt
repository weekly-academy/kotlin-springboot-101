package domain

/**
 * @Author Heli
 */
class WordComparator {
    fun isEquals(user: String, system: String): Boolean = user == system

    fun compare(user: String, system: String): List<CompareStatus> {
        return user.toList().mapIndexed { userIndex, userChar ->
            when {
                system[userIndex] == userChar -> CompareStatus.CORRECT
                system.contains(userChar) -> CompareStatus.ABSENT
                else -> CompareStatus.NONE
            }
        }
    }
}

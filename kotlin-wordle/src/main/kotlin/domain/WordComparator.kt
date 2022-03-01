package domain

class WordComparator {
    fun isEquals(user: Any, system: String): Boolean = user == system

    fun greenLetters(user: String, system: String): List<Char> {
        return system.toList().filterIndexed { index, c ->
            user[index] == c
        }
    }

    fun yellowLetters(user: String, system: String): List<Char> {
        return user.toList().flatMapIndexed { userIndex, userChar ->
            system.toList().filterIndexed { systemIndex, systemChar ->
                systemIndex != userIndex && userChar == systemChar
            }
        }
    }

    fun grayLetters(user: String, system: String): List<Char> {
        return user.toList().filter { !system.contains(it) }
    }
}

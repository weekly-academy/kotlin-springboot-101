package domain

class WordComparator {
    fun isEquals(user: Any, system: String): Boolean = user == system

    fun greenLetters(user: String, system: String): List<Char> {
        return system.toList().filterIndexed { index, c ->
            user[index] == c
        }
    }

    fun yellowLetters(user: String, system: String): List<Char> {
        return system.toList().filterIndexed { index, c ->
            user[index] == c
        }
    }

    fun grayLetters(user: String, system: String): List<Char> {
        return user.toList().filter { !system.contains(it) }
    }
}
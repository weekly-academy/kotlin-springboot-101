package domain

class WordComparator {
    fun isEquals(user: String, system: String): Boolean = user == system

    //TODO: character를 return할 게 아니라 위치를 return 해야 한다
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

package ex20220301

fun main() {
    val friends = mutableListOf<String>("kang", "lee", "choi", "park")

    val user1 = User("kim", 75, friends)
    user1.isSuperStar = true

    val user2 = user1.copy()
    user2.friends.add("jung")

    println(user1)
    println(user2) // user1's properties are same with user2
}

data class User(val name: String, val age:Int, val friends: MutableList<String>) {
    var isSuperStar: Boolean = false
}
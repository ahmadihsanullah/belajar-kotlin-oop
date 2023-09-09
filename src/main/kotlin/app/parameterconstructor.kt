package app

import data.User

fun main() {
    val user1 = User("ahma","rahasia")
    val user2 = User("budi","rahasia")

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}
package app

import data.Game
import data.Login
import data.MinMax

fun minMax(value1: Int, value2: Int):MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }

}

fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val game = Game("ff", 1000000)
    val (name, price) = game
    println(name)
    println(price)

    val minmax = minMax(100,10)
    val (min, max) = minmax
    println(min)
    println(max)

    val request = Login("eko", "rahasia")
    val success = login(request){ (user, password)
        -> user == "eko" && password == "rahasia"
    }

    println(success)
}
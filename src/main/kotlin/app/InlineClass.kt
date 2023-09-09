package app

import data.Token

fun main() {
    val result = Token("ini token")
    println(result.name)
    println(result.toUpper())
}
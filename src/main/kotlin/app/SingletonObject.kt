package app

import data.Application
import data.Utilities

fun main() {
    val result = Utilities.toUpper("ihsan")
    println(Utilities.name)
    Utilities.name = "dirubah"
    println(result)

    a()
    b()

    println(Application.toUpper("ahmad"))
    println(Application.Companion.toUpper("ahmad"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}

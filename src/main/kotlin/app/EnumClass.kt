package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val values : Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(values.toList())

    man.getDescription()
    woman.getDescription()
}
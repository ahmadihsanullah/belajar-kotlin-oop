package app

import data.Boss

fun main() {
    val boss1 = Boss("Ahmad")
    val employee1 = boss1.Employee("Aji")
    val employee2 = boss1.Employee("Ucup")

    employee1.hi()
    employee2.hi()
}
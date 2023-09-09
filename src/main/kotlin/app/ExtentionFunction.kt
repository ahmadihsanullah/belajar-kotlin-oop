package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Ihsan", 20)
    student.sayHello("ihsan")
    println(student?.upperName)
}
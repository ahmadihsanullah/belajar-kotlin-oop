package app

import data.Circle
import data.Rectangle
import data.Shape

fun main() {
    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Circle()
    println(shape2.corner)
    println(shape2.superCorner)

    val shape3 = Rectangle()
    println(shape3.corner)
}
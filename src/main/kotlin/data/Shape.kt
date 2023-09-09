package data

open class Shape {
    open val corner: Int = -1
}

class Circle: Shape(){
    override val corner: Int = 4
    val superCorner: Int = super.corner
}

class Rectangle: Shape(){
    override val corner: Int = 3
}
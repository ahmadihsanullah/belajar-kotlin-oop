package app

import data.Base
import data.MyBase
import data.myBaseDelegate

fun main() {
    val myBase = MyBase()
    val myBaseDelegate= myBaseDelegate(myBase)

    println(myBaseDelegate.sayHello("ahmad"))
    println(myBaseDelegate.sayGoodBya("ahmad"))

}
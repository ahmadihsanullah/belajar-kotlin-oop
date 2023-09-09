package app

import data.Manager
import data.vicePresident

fun main() {
    val manager = Manager("ahmad")
    manager.sayHello("ihsan")

    val vp = vicePresident("hanif")
    vp.sayHello("rehan")
}
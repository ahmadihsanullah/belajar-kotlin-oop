package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2021
    val almaz = Car("Wuling", "Daihatsu")

    println(avanza.brand)
    println(avanza.year)

    println(almaz.brand)
    println(almaz.year)
}
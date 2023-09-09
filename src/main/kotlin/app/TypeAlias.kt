package app

import data.Application

typealias App = Application
typealias Aplikasi = App
typealias supplierString = ()-> String

fun sayHello(name: supplierString){
    println("Hello ${name()}")
}

fun main() {
    val app = App("kotlin oop")
    val aplikasi = Aplikasi("kotlin oop")

    sayHello { "ahmad" }
}
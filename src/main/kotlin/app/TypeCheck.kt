package app

import data.Laptop
import data.Smartphone

fun printObject(any : Any){
    if(any is Laptop){
        //any auto menjadi object dari Laptop
        println("Laptop with name ${any.name}")
    } else if(any is Smartphone){
        println("Smartphone with name ${any.name} and os ${any.os}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any : Any){
    //any auto menjadi object dari Laptop
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is Smartphone -> println("Smartphone with name ${any.name} and os ${any.os}")
        else -> println(any)
    }
}

fun printString(any : Any){
    val value = any as String
    println(value)
}

fun printStringSafeAny(any : Any){
    //save nullable cast =? jika !string akan null
    val value = any as? String
    println(value)
}

fun main() {
    printString("eko")
//    printString(1)

    printStringSafeAny(1)

    printObject(Smartphone("Samsung", "Kitkat"))
    printObject(Laptop("Lenovo"))
    printObject("laptop with name")

    printObjectWithWhen(Smartphone("Samsung", "Kitkat"))
    printObjectWithWhen(Laptop("Lenovo"))
    printObjectWithWhen("tidak ada laptop")
}
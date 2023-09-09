package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("eko")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Ahmad",1_000_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}
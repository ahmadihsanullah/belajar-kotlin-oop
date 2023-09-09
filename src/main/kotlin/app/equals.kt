package app

import data.Company

fun main() {
    val company1 = Company("ahmad", "keuangan")
    val company2 = Company("ahmad", "keuangan")

    println(company1 == company2)
    println(company1 == company1)
}
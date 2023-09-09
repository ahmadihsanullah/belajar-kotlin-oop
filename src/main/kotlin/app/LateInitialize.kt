package app

import data.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Samsung")
    //sebelum dipanggil harus diinisialisasi dulu propertiesnya
    println(tv.brand)
}
package app

import data.City
import data.Country
import data.Location

fun main() {
    //error => abstract cannot be implemented
//    val location = Location("Subang")

    val country: Location = Country("Indonesia")
    val city: Location = City("Bogor")

    println(country.name)
    println(city.name)
}

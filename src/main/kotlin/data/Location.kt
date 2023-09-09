package data

abstract class Location(val name: String)

class Country(name: String) : Location(name)

class City(name: String) : Location(name)
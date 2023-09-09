package data

class Car(var paramBrand:String,var paramName: String, var paramYear:Int) {
    init {
        println("primary constructor: $paramBrand dibuat")
    }

    constructor(paramBrand:String,paramName: String):this(paramBrand,paramName, 2020 ){
        println("secondary constructor 1")
    }

    constructor(paramBrand: String):this(paramBrand, ""){
        println("secondary constructor 2")
    }

    var brand:String = paramBrand
    var name:String = paramName
    var year:Int = paramYear
}
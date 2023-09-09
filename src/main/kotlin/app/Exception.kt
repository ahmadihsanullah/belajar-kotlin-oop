package app

import exception.ValidationException

fun validateAndSayHello(name: String){
    if(name.isBlank()){
        throw ValidationException(message ="name must not be blank")
    }
    println("Hello $name")
}

fun main() {
    try {
        validateAndSayHello("hanif")
        validateAndSayHello("")
    }catch (error: ValidationException){
        println("Error: ${error.message}")
    }finally {
        println("error gk error dieksekusi")
    }

}
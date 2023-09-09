package data

class Student(val name: String, val age: Int)

//extension function
fun Student?.sayHello(name: String){
    //hanya bisa mengakses public member
    if(this != null){
        println("Hello ${name}, my name is ${this.name} and my age is ${this.age}")
    }
}

//properties function
val Student.upperName:String
    get() = this.name.uppercase()

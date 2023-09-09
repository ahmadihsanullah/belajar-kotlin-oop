package data

open class Employee(val name: String) {

    open fun sayHello(name: String){
        println("Hello $name my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name my name is manager ${this.name}")

    }
}

class superManager(name: String) : Manager(name){
    //tidak bisa override karena sudah final
//    override fun sayHello(name: String) {
//        println("Hello $name my name is super manager  ${this.name}")
//    }
}
class vicePresident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name my name is vice president ${this.name}")
    }
}
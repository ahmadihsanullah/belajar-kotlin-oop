package data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String = "cat"
    override fun run() {
        println("cat run")
    }
}

class Dog : Animal() {
    override val name: String = "dog"
    override fun run() {
        println("dog run")
    }
}
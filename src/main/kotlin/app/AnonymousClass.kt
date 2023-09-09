package app

interface Action {
    fun action() : Unit
}

fun fireAction(action: Action){
    action.action()
}

class simpleAction() : Action{
    override fun action() {
        println("this is simple action")
    }
}

fun main() {
    fireAction(simpleAction())

    //use anonymous
    fireAction(object : Action {
        override fun action() = println("this is action1")
    })

    fireAction(object : Action {
        override fun action() = println("this is action2")
    })
}

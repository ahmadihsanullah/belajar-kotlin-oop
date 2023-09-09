package app

data class Friend(val name: String)

fun sayHello(friend: Friend?){
    //menggunakan checking secara manual
    if(friend != null){
        println("Hello ${friend.name}")
    }

    //menggunakan safecall,kata null tetap akan tercetak
    println("hello ${friend?.name}")

//    elfis operator
    val name = friend?.name ?: ""
    println("Hello $name")

    //menggunakan !!, tidak direkomendasikan karena jika null akan error
    val name2 = friend!!.name
    println("Hello $name")
}

fun main() {
    val friend = sayHello(Friend("Hanif"))
    val friend2 = sayHello(null)
}

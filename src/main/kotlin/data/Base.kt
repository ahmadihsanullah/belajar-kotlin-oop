package data

import data.Utilities.name

interface Base {
    fun sayHello(name: String):String
    fun sayGoodBya(name: String):String
}

class MyBase: Base  {
    override fun sayHello(name: String):String {
        return "hello $name"
    }

    override fun sayGoodBya(name: String):String{
        return "Good bye $name"
    }

}
//membuat delegation
//meneruskan properties atau function ke object yang lain tanpa harus mengoverrid bila interface

class myBaseDelegate(val base: Base): Base by base
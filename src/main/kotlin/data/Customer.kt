package data

open class Customer(val name: String, val type: String, val balance: Int) {
    constructor(name: String,type: String): this(name,type,0)
    constructor(name:String):this(name,"Standard")
}

class PremiumCustomer : Customer {
    constructor(name: String):super(name,"Premium")
    constructor(name : String, balance: Int):super(name,"Premium",balance)
}

class ExecutiveCustomer(name: String, balance: Int) : Customer(name,"Executive",balance){
    constructor(name:String): this(name,0);
}

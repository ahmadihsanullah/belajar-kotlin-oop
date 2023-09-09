package data

class Note(title: String) {
    var title: String = title
        get() {
            println("calling getter")
            return field
        }
        set(value) {
            println("calling setter")
            if(value.isNotBlank()){
                field = value
            }else{
                "invalid title"
            }
        }
}

class BigNote(val title: String){
    var bigTitle:String = title
        get(){
            return title.uppercase()
        }
}
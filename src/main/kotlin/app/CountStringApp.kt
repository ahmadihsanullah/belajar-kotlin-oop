package app

class CountStringApp(val value: String){
    fun countCharacterWithoutDoubleCharacter(): Int{
        var valueLowercase = value.lowercase()
        var mutableList = mutableListOf<Char>()
        var counter = 0
        for(i in valueLowercase){
            if(i !in mutableList){
                mutableList.add(i)
                counter++
            }
        }
        return counter
    }

    fun countCharacter(): Int{
        var valueLowercase = value.lowercase()
        var counter = 0
        for(i in valueLowercase){
            if (i != ' '){
                counter++
            }
        }
        return counter
    }

    fun countWord(): Int{
        val valueLowercase = value.lowercase()
        val words : List<String> = valueLowercase.split(" ")
        var counter = 0

        for(word in words){
            if(word!= ""){
                counter++
            }
        }
        return counter
    }
}

fun main() {
    val countApp = CountStringApp("ahmad ihsan")
    println(countApp.countCharacterWithoutDoubleCharacter())
    println(countApp.countCharacter())
    println(countApp.countWord())
}
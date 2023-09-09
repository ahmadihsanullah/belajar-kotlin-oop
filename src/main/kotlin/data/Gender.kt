package data

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun getDescription():Unit{
        println(description)
    }
}
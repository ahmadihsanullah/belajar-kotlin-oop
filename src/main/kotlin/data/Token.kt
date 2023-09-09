package data

inline class Token(val name: String) {
    //inline class hanya dan harus memilik 1 property
    fun toUpper(): String = name.uppercase()
}
package data

class Company(val name: String, val kategori: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> {
                other.name == this.name && other.kategori == this.kategori
            }
            else -> false
        }
    }
}
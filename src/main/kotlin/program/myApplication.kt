package program

import annotation.Fancy

@Fancy("ahmad")
class myApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name-$version"
}
package ch3

object MySingleton {
    val myProperty = 3

    fun myFunction() = "Hello"
}

fun doNothing(): Nothing = throw Exception("Nothing at all")

fun main() {
    println(MySingleton.myProperty)
    doNothing()
}
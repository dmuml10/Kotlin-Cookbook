package ch7

fun processString(str: String) =
    str?.let {
        when {
            it.isBlank() -> "Is Blank"
            it.isEmpty() -> "Is Empty"
            else -> it.uppercase()
        }
    }



fun main() {
    println(processString("test"))

    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}
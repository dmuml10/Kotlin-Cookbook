package ch5

val strings = arrayOf("a", "b", "c")

val nullStringArray = arrayOfNulls<String>(2)

val squares = Array(5){i -> (i * i).toString()}

fun main() {
    for ((index, value) in strings.withIndex()) {
        println("$index $value")
    }
}
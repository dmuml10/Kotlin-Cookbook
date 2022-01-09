package ch5

val keys = 'A' .. 'Z'
val maps = keys.associate {it.toString().repeat(2) to it.toString().lowercase() }
val lowercase = keys.associateWith {it.toString().lowercase() }

fun main() {
    println(maps)
    println(lowercase)
}
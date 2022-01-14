package ch7

import kotlin.math.nextTowards

fun save(officer: Officer) =
    officer.apply {
        id = calculateNewId()
    }

fun calculateNewId(): Int {
    val result = Math.random().nextTowards(1000.0)
    println("New ID: $result")
    return result.toInt()
}

class Officer(var id: Int, val name: String)

fun main() {
    val officer = Officer(1, "Guy")
    println(save(officer))
}
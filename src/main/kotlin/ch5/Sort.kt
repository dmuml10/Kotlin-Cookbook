package ch5

data class Golfer(val score: Int, val first: String, val last: String)

val golfers = listOf(
    Golfer(70, "Jack", "Nicklaus"),
    Golfer(68, "Tom", "Watson"),
    Golfer(68, "Bubba", "Watson"),
    Golfer(70, "Tiger", "Woods"),
    Golfer(68, "Ty", "Webb")
)

fun main() {
    val sorted = golfers.sortedWith(compareBy({it.score}, {it.first}, {it.last}))

    sorted.forEach { println(it) }
}
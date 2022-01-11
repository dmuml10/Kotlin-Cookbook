package ch6

val numSequence1 = sequenceOf(3, 1, 4, 1, 5, 9)
val numSequence2 = listOf(3, 1, 4, 1, 5, 9).asSequence()

fun main() {
    //Inefficient
    (100 until 200).map { it * 2 }
        .filter { it % 3 == 0 }
        .first()

    (100 until 200).map { it * 2 }
        .first{ it % 3 ==0 }
}
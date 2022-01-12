package ch6

import kotlin.math.ceil
import kotlin.math.sqrt


fun Int.isPrime() =
    this == 2 || (2..ceil(sqrt(this.toDouble())).toInt())
        .none { divisor -> this % divisor == 0 }

fun nextPrime(n: Int) =
    generateSequence( n + 1 ) {it + 1}
        .first(Int::isPrime)

fun firstNPrimes(n: Int) =
    generateSequence(2, ::nextPrime)
        .take(n)
        .toList()

fun primesLessThan(max: Int): List<Int> =
    generateSequence(2, ::nextPrime)
        .takeWhile { it < max }
        .toList()

fun main() {
    println(nextPrime(113))
    println(nextPrime(1000000))

    println(firstNPrimes(20))
}
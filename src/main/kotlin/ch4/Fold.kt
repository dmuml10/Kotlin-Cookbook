package ch4

import java.math.BigInteger

fun sum(vararg nums: Int) =
    nums.fold(0) {acc, i -> acc + i}

fun main() {
    val numbers = intArrayOf(3, 1, 4, 1, 5, 9)
    println(numbers.sum())
    println(sum(numbers.sum()))
}

fun factorialFold(n: Long): BigInteger =
    when(n) {
        0L, 1L -> BigInteger.ONE
        else -> (2..n).fold(BigInteger.ONE) { acc, i ->
            acc * BigInteger.valueOf(i) }
    }

fun fibonacciFold(n: Int) =
    (2 until n).fold(1 to 1) { (prev, curr), _ ->
        curr to (prev + curr) }.second
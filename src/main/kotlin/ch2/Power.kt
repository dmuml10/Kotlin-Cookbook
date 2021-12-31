package ch2

import kotlin.math.pow

class Power {

    infix fun Int.`**`(x: Int) = toDouble().pow(x).toInt()
    infix fun Long.`**`(x: Int) = toDouble().pow(x).toLong()
    infix fun Float.`**`(x: Int) = pow(x)
    infix fun Double.`**`(x: Int) = pow(x)

    // Pattern similar to existing functions on Float and Double
    fun Int.pow(x: Int) = `**`(x)
    fun Long.pow(x: Int) = `**`(x)

    fun test() {
        val x = 10 `**` 2
    }

}
package ch11

fun printMod3(n: Int) {
    when(n % 3) {
        0 -> println("0")
        1 -> println("1")
        2 -> println("2")
        //else -> println("Houston we have a problem...")
    }
}

fun main() {
    println(KotlinVersion.CURRENT)

    repeat(5) {
        println("Counting: $it")
    }

    printMod3(13)

    println("Some String".replace("str", "newStr", true))

    val str = 42.toString(radix = 2)
}
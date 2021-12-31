package ch2

fun `create map using infix to function`() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 2)

    println(map.containsKey("a"))
    println(map.containsKey("b"))
    println(map.containsKey("c"))
    println(map.containsValue(1))
    println(map.containsValue(2))
}

fun `create a Pair from constructor vs to function`() {
    val p1 = Pair("a", 1)
    val p2 = "a" to 1

    println(p1 == p2)
}

fun `destructuring a Pair`() {
    val pair = "a" to 1
    val (x,y) = pair

    println(x == "a")
    println(y == 1)
}

fun main() {
    println("Hello world!")
    `create map using infix to function`()
    println("------------")
    `create a Pair from constructor vs to function`()
    println("------------")
    `destructuring a Pair`()
}
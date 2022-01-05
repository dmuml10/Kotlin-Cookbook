package ch4

fun sumReduce(vararg nums: Int) =
    nums.reduce { acc, i -> acc + i }

fun main() {
    println(sumReduce(3, 2, 1))

    val array = intArrayOf(1, 2, 3, 4, 5)
    print(sumReduce(array.sum()))
    print(' ')
    print(sumReduce(*array))
}
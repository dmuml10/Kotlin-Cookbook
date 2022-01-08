package ch5

var numList = listOf(3, 1, 4, 1, 5, 9)
var numSet = setOf(3, 1, 4, 1, 5, 9)
var map = mapOf(1 to "one", 2 to "two", 3 to "three")

var mutableList = mutableListOf(1, 2, 3)
var mutableSet = mutableSetOf(1, 2, 3, 3)
var mutableMap = mutableMapOf("a" to "aa", "b" to "bb")

fun main() {
    mutableList.add(4)
    println(mutableList)

    mutableSet.add(4)
    println(mutableSet)

    mutableMap["c"] = "cc"
    println(mutableMap)
}
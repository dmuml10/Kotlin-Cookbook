package ch10

import java.io.File

fun get10LongestWordsInDictionary() =
    File("words.txt").useLines { line ->
        line.filter { it.length > 5 }
            .sortedByDescending(String::length)
            .take(10)
            .toList()
    }

fun main() {
    println(get10LongestWordsInDictionary())
}
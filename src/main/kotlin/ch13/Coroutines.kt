package ch13

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun blocking() {
    println("Before creating coroutine")
    runBlocking {
        print("Hello, ")
        delay(200L)
        println("World!")
    }
    println("After coroutine is finished")
}

fun launchC() {
    println("Before runBlocking")
    runBlocking {
        println("Before launch")
        launch {
            print("Hello, ")
            delay(200L)
            println("World!")
        }
        println("After launch")
    }
    println("After runBlocking")
}

fun main() {
    launchC()
}
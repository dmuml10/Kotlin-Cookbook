package ch13

import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

fun main() = runBlocking<Unit> {
    val dispatcher = Executors.newFixedThreadPool(10)
    .asCoroutineDispatcher()

    withContext(dispatcher) {
        delay(100L)
        println(Thread.currentThread().name)
    }

    dispatcher.close()
}
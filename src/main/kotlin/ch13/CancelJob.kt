package ch13

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {
    val job = launch {
        repeat(100) { i ->
            println("job: I'm waiting $i...")
            delay(100L)
        }
    }
    delay(500L)
    println("main: That's enough waiting")
    job.cancel()
    job.join()
    println("main: Done")
}

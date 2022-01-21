package ch11

import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {
    (0..5).forEach { n ->
        val sleepTime = Random.nextLong(0, 1000)
        thread {
            Thread.sleep(sleepTime)
            println("${Thread.currentThread().name} for $n after ${sleepTime}ms")
        }

        thread(isDaemon = true) {      1
            Thread.sleep(sleepTime)
            println("${Thread.currentThread().name} for $n after ${sleepTime}ms")
        }

    }

    (0..5).forEach { n ->
        val sleepTime = Random.nextLong(0, 1000)
        thread {
            Thread.sleep(sleepTime)
            println("${Thread.currentThread().name} for $n after ${sleepTime}ms")
        }.join()
    }
}
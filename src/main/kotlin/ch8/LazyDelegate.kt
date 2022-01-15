package ch8

val ultimateAnswer: Int by lazy {
    println("computing the answer")
    42
}

fun main() {
    println(ultimateAnswer)
    println(ultimateAnswer)
}
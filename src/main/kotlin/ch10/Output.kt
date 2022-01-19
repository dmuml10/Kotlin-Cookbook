package ch10

import java.io.File

fun writeToFile(text: String) {
    File("myFile.txt").writeText(text)
}

fun writeWithPrintWriter() {
    File("filename.txt").printWriter().use { writer ->
        writer.println("Sample") }
}

fun main() {
    writeToFile("Random sample text")
}
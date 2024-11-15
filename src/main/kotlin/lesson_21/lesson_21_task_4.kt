package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("new_file.txt")

    file.lowercaseWrite("NeW YoRk")
    file.writeText("world!")
    file.writeToTheBeginning("Hello")

}

fun File.writeToTheBeginning(text: String) {
    val originalFileContent = this.readText()
    val newContent = "$text $originalFileContent"

    this.writeText(newContent)
}

fun File.lowercaseWrite(text: String) {
    this.writeText(text.lowercase())
}
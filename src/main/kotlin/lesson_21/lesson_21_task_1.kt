package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    return this.count { it.lowercaseChar() in vowels }
}

fun main() {

    val hello = "hellO"
    println("Гласных в слове $hello : ${hello.vowelCount()}")

}
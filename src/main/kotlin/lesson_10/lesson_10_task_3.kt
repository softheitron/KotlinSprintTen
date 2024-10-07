package org.example.lesson_10

fun main() {

    print("Задайте длину пароля: ")
    val passwordLengthInput = readln().toInt()

    println("Сгенерированный пароль: ${passwordGenerator(passwordLengthInput)}")

}

fun passwordGenerator(passLength: Int): String {
    val naturalNumbers = 1..9
    val specialCharactersList = listOf(
        "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", " ")
    var generatedPassword = ""

    for (i in 1..passLength) {
        if (i % 2 != 0) {
            generatedPassword += naturalNumbers.random()
        } else generatedPassword += specialCharactersList.random()
    }

    return generatedPassword
}
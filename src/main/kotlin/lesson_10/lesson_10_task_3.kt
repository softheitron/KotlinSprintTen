package org.example.lesson_10

fun main() {

    print("Задайте длину пароля: ")
    val passwordLengthInput = readln().toInt()

    println("Сгенерированный пароль: ${generatePassword(passwordLengthInput)}")

}

fun generatePassword(passLength: Int): String {
    val naturalNumbers = 1..9
    val specialCharactersList = ' '..'/'
    var generatedPassword = ""

    for (i in 1..passLength) {
        if (i % 2 != 0) {
            generatedPassword += naturalNumbers.random()
        } else generatedPassword += specialCharactersList.random()
    }

    return generatedPassword
}
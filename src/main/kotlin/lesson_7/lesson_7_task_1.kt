package org.example.lesson_7

fun main() {

    var passwordString = ""

    for (i in 1..6) {
        if (i % 2 != 0) {
            val passwordChar = ('a'..'z').random()
            passwordString += passwordChar
        } else {
            val passwordNum = (1..9).random()
            passwordString += passwordNum
        }
    }

    print("Сгенерированный пароль: $passwordString")

}
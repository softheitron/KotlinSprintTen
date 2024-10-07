package org.example.lesson_7

fun main() {

    var passwordString = ""
    val passwordChar = ('a'..'z')
    val passwordNum = (1..9)

    for (i in 1..6) {
        if (i % 2 != 0) {
            passwordString += passwordChar.random()
        } else {
            passwordString += passwordNum.random()
        }
    }

    print("Сгенерированный пароль: $passwordString")

}
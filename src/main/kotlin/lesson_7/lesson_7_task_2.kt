package org.example.lesson_7

fun main() {

    do {
        val smsCode = (1000..9999).random()
        println("Ваш код активации: $smsCode")
        print("Введите код из sms: ")
        val codeInput = readln().toInt()
        if (codeInput == smsCode) {
            print("Вход выполнен!\nДобро пожаловать!")
            return
        }
    } while (true)

}
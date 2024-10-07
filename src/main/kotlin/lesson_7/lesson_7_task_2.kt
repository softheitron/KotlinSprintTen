package org.example.lesson_7

fun main() {

    var smsCode = (1000..9999).random()
    println("Ваш код активации: $smsCode")

    print("Введите код из sms: ")
    var codeInput = readln().toInt()

    while (smsCode != codeInput) {
        println("Неверный код, попробуйте еще раз")
        smsCode = (1000..9999).random()
        println("Ваш код активации: $smsCode")
        print("Введите код из sms: ")
        codeInput = readln().toInt()
    }

    print("Вход выполнен!\nДобро пожаловать!")

}
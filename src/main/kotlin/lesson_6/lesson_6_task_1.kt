package org.example.lesson_6

fun main() {

    println("Что бы войти, нужно сначала создать учетную запись")

    print("Введите желаемое имя пользователя:")
    val usernameRegistrationInput = readln()

    print("Введите желаемый пароль:")
    val passwordRegistrationInput = readln()

    println("Учетная запись успешно создана, переходим к авторизации...")
    var isAccessValid = false

    while (!isAccessValid) {

        print("Введите логин:")
        val usernameInput = readln()

        print("Введите пароль:")
        val passwordInput = readln()

        if ((usernameInput == usernameRegistrationInput) &&
            (passwordInput == passwordRegistrationInput)) {
            print("Авторизация прошла успешно!")
            isAccessValid = true
        } else println("Данные введены не верно, попробуйте еще раз")

    }

}
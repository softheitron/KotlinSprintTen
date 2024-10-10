package org.example.lesson_10

const val MIN_USER_DATA_LENGTH = 4

fun main() {

    print("Придумайте логин: ")
    val loginInput = readln()
    print("Придумайте пароль: ")
    val passwordInput = readln()

    if (validateUserDataLength(loginInput, passwordInput)) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные")

}

fun validateUserDataLength(userLogin: String, userPassword: String): Boolean =
    !(userLogin.length < MIN_USER_DATA_LENGTH ||
            userPassword.length < MIN_USER_DATA_LENGTH)
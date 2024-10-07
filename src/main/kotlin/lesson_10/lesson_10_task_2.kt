package org.example.lesson_10

const val MIN_USER_DATA_LENGTH = 4

fun main() {

    print("Придумайте логин: ")
    val loginInput = readln()
    print("Придумайте пароль: ")
    val passwordInput = readln()

    validateUserDataLength(loginInput, passwordInput)

}

fun validateUserDataLength(userLogin: String, userPassword: String) {
    if (userLogin.length < MIN_USER_DATA_LENGTH ||
        userPassword.length < MIN_USER_DATA_LENGTH) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать!")
}
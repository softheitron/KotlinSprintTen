package org.example.lesson_10

const val MIN_USER_DATA_LENGTH = 4

fun main() {

    print("Придумайте логин: ")
    val loginInput = readln()
    print("Придумайте пароль: ")
    val passwordInput = readln()

     val isDataOk = validateUserDataLength(loginInput, passwordInput)

    if (isDataOk) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные")

}

fun validateUserDataLength(userLogin: String, userPassword: String): Boolean {
    return if (userLogin.length < MIN_USER_DATA_LENGTH ||
        userPassword.length < MIN_USER_DATA_LENGTH) {
        false
    } else true
}
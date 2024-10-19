package org.example.lesson_16

class User(private val login: String, private val password: String) {

    fun passwordValidation(password: String): Boolean {
        return password == this.password
    }

}

fun main() {

    val user = User("Login", "password")

    print("Введите пароль: ")
    val passwordInput = readln()

    if (user.passwordValidation(passwordInput)) {
        println("Все верно. Добро пожаловать!")
    } else println("Неверный пароль!!")

}
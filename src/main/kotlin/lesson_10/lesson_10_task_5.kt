package org.example.lesson_10

const val TOKEN_SYMBOLS_AMOUNT = 32
const val LOGIN = "John"
const val PASSWORD = "qwerty123"

fun main() {

    print("Введите логин: ")
    val loginInput = readln()
    print("Введите пароль: ")
    val passwordInput = readln()

    val token = generateAuthorizationToken(login = loginInput, password = passwordInput)

    if (token != null) {
        println("Товары в корзине: ${getShoppingCart(token)?.joinToString()}")
    } else println("Неудачная авторизация")

}

val tokenMap = mutableMapOf<String, List<String>>()
val cart = listOf("молоко", "бутылка воды", "зубная паста")
val randomChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')

fun generateAuthorizationToken(login: String, password: String): String? {
    if (login.trim() == LOGIN && password.trim() == PASSWORD) {
        var generatedToken = ""
        for (i in 1..TOKEN_SYMBOLS_AMOUNT) {
            generatedToken += randomChars.random()
        }
        tokenMap[generatedToken] = cart
        return generatedToken
    } else {
        return null
    }
}

fun getShoppingCart(token: String): List<String>? {
    return if (token in tokenMap.keys) tokenMap[token] else null
}
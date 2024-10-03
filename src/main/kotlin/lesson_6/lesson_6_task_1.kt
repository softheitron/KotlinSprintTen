package org.example.lesson_6

/*
На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию.
Нужно создать блок программы, который сначала предлагает создать логин и пароль, затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново. Если данные верны, выводится сообщение – “Авторизация прошла успешно”.
*/

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
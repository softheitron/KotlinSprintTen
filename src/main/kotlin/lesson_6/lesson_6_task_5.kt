package org.example.lesson_6

fun main() {

    println(
        "Для входа в приложение вам нужно подтвердить что вы не бот\n" +
                "Для этого нужно будет решить пример(у вас будет 3 попытки)"
    )

    var answerCounter = 3

    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        print("Решите сгенерированный пример: $firstNumber + $secondNumber = ")
        val answerNumberInput = readln().toInt()
        val isAnswerRight = (firstNumber + secondNumber) == answerNumberInput
        if (isAnswerRight) {
            println("Добро пожаловать!")
        } else if (answerCounter > 1) {
            println("Неверно! Осталось попыток ${--answerCounter}")
        } else {
            println("Доступ запрещен! Вы бот :)")
            return
        }
    } while (!isAnswerRight)

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
            (passwordInput == passwordRegistrationInput)
        ) {
            print("Авторизация прошла успешно!")
            isAccessValid = true
        } else println("Данные введены не верно, попробуйте еще раз")

    }
}
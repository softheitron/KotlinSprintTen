package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val variableA = Random.nextInt(1, 50)
    val variableB = Random.nextInt(1, 50)

    println("Что бы войти, мы должны убедиться что вы не бот\nРешите следующий пример: $variableA + $variableB = ?")

    print("Введите ответ: ")
    val answer = readln().toInt()

    val isAnswerCorrect = if ((variableA + variableB) == answer) {
        "Доступ разрешен!"
    } else "Доступ запрещен!"

    print(isAnswerCorrect)

}
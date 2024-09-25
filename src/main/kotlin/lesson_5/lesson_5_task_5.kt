package org.example.lesson_5

import kotlin.random.Random

fun main() {

    println(
        "Добро пожаловать на двойное колесо удачи!\n" +
                "Правила игры:\n" +
                "Что бы получить ДЖЕКПОТ, вам нужно угадать три числа в диапазоне от 0 до 42\n" +
                "Если отгадать два из трех загаданных чисел, вы получите крупный приз!\n" +
                "Если отгадать одно из трех чисел, вы получите утешительный приз!"
    )

    val firstNumber = Random.nextInt(0, 43)
    val secondNumber = Random.nextInt(0, 43)
    val thirdNumber = Random.nextInt(0, 43)
    val winNumList = listOf(firstNumber, secondNumber, thirdNumber)
    println("Числа были сгенерированы!\nУдачи!")

    print("Введите первое число: ")
    val firstNumInput = readln().toInt()
    print("Введите второе число: ")
    val secondNumInput = readln().toInt()
    print("Введите третье число: ")
    val thirdNumInput = readln().toInt()
    val userNumList = listOf(firstNumInput, secondNumInput, thirdNumInput)

    val numberOfMatches = winNumList.intersect(userNumList).size

    println(
        "Выбранные программой числа: $firstNumber, $secondNumber, $thirdNumber\n" +
        "Выбранные вами числа: $firstNumInput, $secondNumInput, $thirdNumInput"
    )

    when(numberOfMatches) {
        1 -> print("Вы выиграли утешительный приз!")
        2 -> print("Вы выиграли крупный приз!")
        3 -> print("Невероятное везение! Вы выиграли ДЖЕКПОТ!")
    }

}
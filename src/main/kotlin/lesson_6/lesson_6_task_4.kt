package org.example.lesson_6

fun main() {

    println("Игра угадай число!\nНужно угадать число от 1 до 9 за 5 попыток")

    val guessedNumber = (1 .. 9).random()
    var guessCounter = 5

    do {
        print("Введите загаданное число: ")
        val guessNumberInput = readln().toInt()
        if (guessNumberInput == guessedNumber) {
            println("Это была великолепная игра!")
        } else if (guessCounter > 1) {
            println("Не угадали! Осталось ${--guessCounter} попыток")
        } else {
            println("Было загадано число $guessedNumber")
            return
        }
    } while (guessNumberInput != guessedNumber)

}
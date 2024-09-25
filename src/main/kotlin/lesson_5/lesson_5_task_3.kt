package org.example.lesson_5

fun main() {

    println(
        "Добро пожаловать на двойное колесо удачи!\n" +
                "Правила игры:\n" +
                "Что бы выиграть, вам нужно угадать два числа в диапазоне от 0 до 42\n" +
                "Если отгадать только одно из двух загаданных чисел, вы получите утешительный приз"
    )

    val firstNumber = 12
    val secondNumber = 34
    println("Числа были сгенерированы!\nУдачи!")

    print("Введите первое число: ")
    val firstNumInput = readln().toInt()
    print("Введите второе число: ")
    val secondNumInput = readln().toInt()

    println(
        "Выбранные программой числа: $firstNumber и $secondNumber\n" +
                "Выбранные вами числа: $firstNumInput и $secondNumInput"
    )

    val winOrLoseMessage =  if ((firstNumInput == firstNumber || firstNumInput == secondNumber) && (secondNumInput == firstNumber || secondNumInput == secondNumber)) {
        "Поздравялем! Вы выиграли главный приз!"
    } else if ((firstNumInput == firstNumber || firstNumInput == secondNumber) || (secondNumInput == firstNumber || secondNumInput == secondNumber)) {
        "Вы выиграли утешительный приз!"
    } else "Неудача!"

    print(winOrLoseMessage)

}
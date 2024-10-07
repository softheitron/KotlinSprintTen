package org.example.lesson_10

fun main() {

    var humanDice: Int
    var machineDice: Int
    var choiceInput: String

    var humanWinsCounter = 0
    var isStillPlaying = true

    do {
        humanDice = randomRollDice()
        machineDice = randomRollDice()
        showWhoWon(humanDice, machineDice)
        if (humanDice > machineDice) {
            humanWinsCounter++
        }
        print("Хотите бросить кости еще раз?\nВведите Да или Нет: ")
        choiceInput = readln()
        if (choiceInput.lowercase() != "да") isStillPlaying = false
    } while (isStillPlaying)

    println("Количество выиграных вами партий: $humanWinsCounter")

}

fun randomRollDice(): Int = (1..6).random()

fun showWhoWon(humanDice: Int, machineDice: Int) {
    println("Ход человека")
    println("Человек выбросил: $humanDice")

    println("Ход машины")
    println("Машина выбросила: $machineDice")

    when {
        humanDice > machineDice -> println("Победило человечество!")
        humanDice < machineDice -> println("Победила машина!")
        else -> println("Ничья!")
    }
}



package org.example.lesson_10

fun main() {

    println("Ход человека")
    val humanDice = rollDice()
    println("Человек выбросил: $humanDice")

    println("Ход машины")
    val machineDice = rollDice()
    println("Машина выбросила: $machineDice")

    when {
        humanDice > machineDice -> println("Победило человечество!")
        humanDice < machineDice -> println("Победила машина!")
        else -> println("Ничья!")
    }

}

fun rollDice(): Int = (1..6).random()

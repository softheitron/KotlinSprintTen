package org.example.lesson_16

class Dice {

    private val rollDice = (1..9).random()

    fun getDicedNumber() {
        println("Выпало число: $rollDice")
    }

}

fun main() {

    val dice = Dice()

    dice.getDicedNumber()

}
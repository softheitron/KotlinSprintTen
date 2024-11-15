package org.example.lesson_18

open class DiceItem {

    open fun rollDice() {}

}

class DiceFour: DiceItem() {
    override fun rollDice() {
        val randomDice = (1..4).random()
        println("Вы кинули четырехгранный кубик\nВыпало: $randomDice")
    }
}

class DiceSix: DiceItem() {
    override fun rollDice() {
        val randomDice = (1..6).random()
        println("Вы кинули шестигранный кубик\nВыпало: $randomDice")
    }
}

class DiceEight: DiceItem() {
    override fun rollDice() {
        val randomDice = (1..8).random()
        println("Вы кинули восьмигранный кубик\nВыпало: $randomDice")
    }
}

fun main() {

    val dice4 = DiceFour()
    val dice6 = DiceSix()
    val dice8 = DiceEight()

    val allDiceList = listOf<DiceItem>(dice4, dice6, dice8)

    allDiceList.forEach {
        it.rollDice()
    }

}
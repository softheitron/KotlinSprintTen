package org.example.lesson_18

enum class DiceEdges(val diceName: String) {
    TETRA("четырехгранник"),
    HEXA("шестигранник"),
    OCTA("восьмигранник");
}

fun setDiceName(edges: Int): String {
    return when(edges) {
        4 -> DiceEdges.TETRA.diceName
        6 -> DiceEdges.HEXA.diceName
        8 -> DiceEdges.OCTA.diceName
        else -> throw IllegalArgumentException("Неизвестное количество граней")
    }
}

abstract class DiceItem {

    abstract val edges: Int
    abstract val diceRange: IntRange
    abstract val diceEdgesName: String

    open fun rollDice(edges: Int) {
        val randomDice = diceRange.random()
        println("Вы бросили $diceEdgesName кубик. Выпало: $randomDice")
    }

}

class DiceFour : DiceItem() {
    override val edges = 4
    override val diceRange = 1..edges
    override val diceEdgesName = setDiceName(edges)
}

class DiceSix : DiceItem() {
    override val edges = 6
    override val diceRange = 1..edges
    override val diceEdgesName = setDiceName(edges)
}

class DiceEight : DiceItem() {
    override val edges: Int = 8
    override val diceRange = 1..edges
    override val diceEdgesName = setDiceName(edges)
}

fun main() {

    val dice4 = DiceFour()
    val dice6 = DiceSix()
    val dice8 = DiceEight()

    val allDiceList = listOf<DiceItem>(dice4, dice6, dice8)

    allDiceList.forEach {
        it.rollDice(it.edges)
    }

}
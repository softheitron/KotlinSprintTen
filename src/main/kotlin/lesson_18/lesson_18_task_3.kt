package org.example.lesson_18

abstract class TamagotchiCharacter {

    abstract fun eat(): String

    abstract fun sleep(): String

}

class Cat: TamagotchiCharacter() {

    override fun eat(): String {
        return "Кошка кушает рыбку"
    }

    override fun sleep(): String {
        return "Кошка спит"
    }

}

class Dog: TamagotchiCharacter() {

    override fun eat(): String {
        return "Соба грызет кость"
    }

    override fun sleep(): String {
        return "Собака спит"
    }

}

class Fox: TamagotchiCharacter() {

    override fun eat(): String {
        return "Лиса ест ягоды"
    }

    override fun sleep(): String {
        return "Лиса спит"
    }

}

fun main() {

    val foxChar = Fox()
    val dogChar = Dog()
    val catChar = Cat()

    val tamagotchiCharList = listOf<TamagotchiCharacter>(foxChar, dogChar, catChar)

    tamagotchiCharList.forEach {
        println(it.eat())
    }

}
package org.example.lesson_18

abstract class TamagotchiCharacter(val name: String) {

    abstract fun eat(): String

    fun sleep(): String {
        return "$name спит"
    }

}

class Cat(name: String) : TamagotchiCharacter(name) {
    override fun eat(): String {
        return "$name кушает рыбку"
    }
}

class Dog(name: String) : TamagotchiCharacter(name) {
    override fun eat(): String {
        return "$name грызет кость"
    }
}

class Fox(name: String) : TamagotchiCharacter(name) {
    override fun eat(): String {
        return "$name ест ягоды"
    }
}

fun main() {

    val foxChar = Fox("Foxy")
    val dogChar = Dog("Doggy")
    val catChar = Cat("Catty")

    val tamagotchiCharList = listOf<TamagotchiCharacter>(foxChar, dogChar, catChar)

    tamagotchiCharList.forEach {
        println(it.eat())
        println(it.sleep())
    }

}
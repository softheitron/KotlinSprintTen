package org.example.lesson_15

interface Searchable {
    fun search()
}

open class Product(val name: String, val availableQuantity: Int) {

    fun showProductInformation() {
        println("Название: $name\nКоличество на складе: $availableQuantity")
    }

}

class Instrument(name: String, availableQuantity: Int,) : Product(name, availableQuantity), Searchable {

    override fun search() {
        println("Выполняется поиск компонентов для $name")
    }

}

class Component(name: String, availableQuantity: Int,) : Product(name, availableQuantity)

fun main() {

    val product1 = Instrument("Gibson Guitar", 2)
    val product2 = Instrument("Fender Strat", 1)

    val component1 = Component("Струны", 12)

    product1.showProductInformation()
    product2.showProductInformation()
    product1.search()
    product2.search()

    component1.showProductInformation()

}
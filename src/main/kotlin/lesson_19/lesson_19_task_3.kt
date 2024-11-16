package org.example.lesson_19

class SpaceShip() {
    fun fly() {
        println("Корабль взлетел")
    }
    fun fire() {
        TODO("Написать логику стрельбы")
    }
    fun land() {
        println("Корабль приземлился")
    }
    // TODO нужно добавить больше интересных методов
}

fun main() {

    val spaceShip1 = SpaceShip()

    spaceShip1.fly()
    spaceShip1.fire()
    spaceShip1.land()

}
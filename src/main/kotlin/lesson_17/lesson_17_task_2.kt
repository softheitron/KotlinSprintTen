package org.example.lesson_17

class Ship(name: String, averageSpeed: Int, portRegistration: String) {

    var name = name
        set(value) {
            println("Вы не можете поменять имя корабля")
        }

}

fun main() {

    val ship1 = Ship("ShipName", 220, "Some Port")

    ship1.name = "Ultramarine"
    println(ship1.name)

}
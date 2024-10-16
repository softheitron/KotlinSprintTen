package org.example.lesson_14

open class LinerShip(
    val name: String,
    val speed: Int = 240,
    val loadCapacity: Int = 870,
    val numberOfPassengers: Int = 120,
)

class CargoShip(
    name: String,
    speed: Int = 190,
    loadCapacity: Int = 1290,
    numberOfPassengers: Int = 60,
) : LinerShip(name, speed, loadCapacity, numberOfPassengers)

class IceBreakerShip(
    name: String,
    speed: Int = 160,
    loadCapacity: Int = 575,
    numberOfPassengers: Int = 60,
    val iceBreak: Boolean = true
) : LinerShip(name, speed, loadCapacity, numberOfPassengers)

fun main() {

    val liner1 = LinerShip(name = "Liner1")
    val cargoShip1 = CargoShip("CargoShip1")
    val iceBreaker1 = IceBreakerShip("IceBreaker1")

    println("${liner1.name}\n" +
            "${liner1.speed}\n" +
            "${liner1.loadCapacity}\n" +
            "${liner1.numberOfPassengers}\n"
    )

    println("${cargoShip1.name}\n" +
            "${cargoShip1.speed}\n" +
            "${cargoShip1.loadCapacity}\n" +
            "${cargoShip1.numberOfPassengers}\n"
    )

    println("${iceBreaker1.name}\n" +
            "${iceBreaker1.speed}\n" +
            "${iceBreaker1.loadCapacity}\n" +
            "${iceBreaker1.numberOfPassengers}\n" +
            "${iceBreaker1.iceBreak}"
    )

}
package org.example.lesson_14

open class LinerShip1(
    val name: String,
    val speed: Int = 240,
    val loadCapacity: Int = 870,
    val numberOfPassengers: Int = 120,
) {
    fun showShipInformation() {
        println("Имя корабля: $name\n" +
                "Максимальная скорость: $speed\n" +
                "Погрузочная вместимость: $loadCapacity\n" +
                "Максимальное количество пассажиров: $numberOfPassengers\n" +
                "Метод погрузки: ${loadShip()}")
    }
    open fun loadShip(): String {
        return "Лайнер выдвигает горизонтальный трап со шкафута для погрузки"
    }
}

class CargoShip1(
    name: String,
    speed: Int = 190,
    loadCapacity: Int = 1290,
    numberOfPassengers: Int = 60,
) : LinerShip1(name, speed, loadCapacity, numberOfPassengers) {
    override fun loadShip(): String {
        return "грузовой корабль активирует погрузочный кран для погрузки"
    }
}

class IceBreakerShip1(
    name: String,
    speed: Int = 160,
    loadCapacity: Int = 575,
    numberOfPassengers: Int = 40,
    val iceBreak: Boolean = true
) : LinerShip1(name, speed, loadCapacity, numberOfPassengers) {
    override fun loadShip(): String {
        return "ледокол открывает ворота со стороны кормы для погрузки"
    }
}

fun main() {

    val liner1 = LinerShip1(name = "Liner1")
    val cargoShip1 = CargoShip1("CargoShip1")
    val iceBreaker1 = IceBreakerShip1("IceBreaker1")

    liner1.showShipInformation()
    cargoShip1.showShipInformation()
    iceBreaker1.showShipInformation()

}
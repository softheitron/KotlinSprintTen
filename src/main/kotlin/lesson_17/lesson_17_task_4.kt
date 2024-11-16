package org.example.lesson_17

class Package() {
    private var moveCounter = 0
    private val packageNumber = 154624
    private var currentLocation = "City1"
        set(value) {
            field = value
            moveCounter++
        }

    fun changeLocation(newLocation: String) {
        currentLocation = newLocation
    }

    fun showPackageInformation() {
        println("Номер посылки: $packageNumber\n" +
                "Текущая локация: $currentLocation\n" +
                "Пройдено пунктов: $moveCounter")
    }
}

fun main() {

    val package1 = Package()

    package1.showPackageInformation()
    package1.changeLocation("City2")
    package1.showPackageInformation()

}
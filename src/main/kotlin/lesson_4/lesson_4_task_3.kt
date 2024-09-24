package org.example.lesson_4

fun main() {

    val isWeatherSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    val isGrowPossible: Boolean =
        isWeatherSunny == true && isAwningOpen == true && airHumidity == 20 && timeOfYear != "зима"

    println("Благоприятные ли условия для роста бобовых?\n$isGrowPossible")

}
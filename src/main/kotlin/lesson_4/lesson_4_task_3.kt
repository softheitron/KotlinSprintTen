package org.example.lesson_4

const val REQUIRED_SUNNY_WEATHER = true
const val REQUIRED_AWNING_POSITION = true
const val REQUIRED_AIR_HUMIDITY = 20
const val WRONG_TIME_OF_YEAR = "зима"

fun main() {

    val sunnyWeather = true
    val awningOpen = true
    val airHumidity = 20
    val todayTimeOfYear = "зима"

    val isGrowPossible: Boolean =
        todayTimeOfYear != WRONG_TIME_OF_YEAR && sunnyWeather == REQUIRED_SUNNY_WEATHER && airHumidity == REQUIRED_AIR_HUMIDITY && awningOpen == REQUIRED_AWNING_POSITION

    println("Благоприятные ли условия для роста бобовых?\n$isGrowPossible")

}
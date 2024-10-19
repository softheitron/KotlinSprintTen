package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val value: Long
}

class WeatherServer {

    fun sendMessageToServer(type : WeatherStationStats) {
        when(type){
            is Temperature -> println("Температура воздуха: ${type.value}°C")
            is PrecipitationAmount -> println("Количество осадков: ${type.value} мм")
            else -> throw IllegalArgumentException("Несуществующий тип данных")
        }
    }

}

class Temperature(override val value: Long) : WeatherStationStats()

class PrecipitationAmount(override val value: Long) : WeatherStationStats()

fun main() {

    val temperature = Temperature(25)
    val precipitation = PrecipitationAmount(10)

    val weatherServer = WeatherServer()

    weatherServer.sendMessageToServer(temperature)
    weatherServer.sendMessageToServer(precipitation)

}
package org.example.lesson_12

const val KELVIN_ZERO_2 = 273

class DayWeather4(_dayTimeTemp: Int, _nightTimeTemp: Int, _isHavePrecipitation: Boolean) {
    val dayTimeTemp = (_dayTimeTemp - KELVIN_ZERO_2)
    val nightTimeTemp = (_nightTimeTemp - KELVIN_ZERO_2)
    val isHavePrecipitation = _isHavePrecipitation

    init {
        if (isHavePrecipitation) {
            println(
                "Температура днем: $dayTimeTemp\n" +
                        "Температура ночью: $nightTimeTemp\n" +
                        "Наличие осадков: Осадки есть"
            )
        } else println(
            "Температура днем: $dayTimeTemp°C\n" +
                    "Температура ночью: $nightTimeTemp°C\n" +
                    "Наличие осадков: Осадков нет"
        )
    }

}

fun main() {

    DayWeather4(278, 255, true)

}
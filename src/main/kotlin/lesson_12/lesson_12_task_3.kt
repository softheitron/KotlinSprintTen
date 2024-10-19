package org.example.lesson_12

const val KELVIN_ZERO = 273

class DayWeather3(_dayTimeTemp: Int, _nightTimeTemp: Int, _isHavePrecipitation: Boolean) {
    val dayTimeTemp = (_dayTimeTemp - KELVIN_ZERO)
    val nightTimeTemp = (_nightTimeTemp - KELVIN_ZERO)
    val isHavePrecipitation = _isHavePrecipitation

    fun showDayWeather() {
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

    val day1 = DayWeather3(273, 265, false)

    day1.showDayWeather()

}
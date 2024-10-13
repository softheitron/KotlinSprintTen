package org.example.lesson_12

class DayWeather2(_dayTimeTemp: Int, _nightTimeTemp: Int, _isHavePrecipitation: Boolean) {
    val dayTimeTemp = _dayTimeTemp
    val nightTimeTemp = _nightTimeTemp
    val isHavePrecipitation = _isHavePrecipitation

    fun showDayWeather() {
        if (isHavePrecipitation) {
            println(
                "Температура днем: $dayTimeTemp\n" +
                        "Температура ночью: $nightTimeTemp\n" +
                        "Наличие осадков: Осадки есть"
            )
        } else println(
            "Температура днем: $dayTimeTemp\n" +
                    "Температура ночью: $nightTimeTemp\n" +
                    "Наличие осадков: Осадков нет"
        )
    }
}

fun main() {

    val day1 = DayWeather2(
        _dayTimeTemp = 12,
        _nightTimeTemp = -2,
        _isHavePrecipitation = true
    )

    day1.showDayWeather()

}
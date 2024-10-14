package org.example.lesson_12

class DayWeather {
    var dayTimeTemp = 0
    var nightTimeTemp = 0
    var isHavePrecipitation = false

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

    val day1 = DayWeather()
    day1.dayTimeTemp = 12
    day1.nightTimeTemp = -4
    day1.isHavePrecipitation = true

    val day2 = DayWeather()
    day2.dayTimeTemp = 4
    day2.nightTimeTemp = -8
    day2.isHavePrecipitation = false

    day1.showDayWeather()
    day2.showDayWeather()

}
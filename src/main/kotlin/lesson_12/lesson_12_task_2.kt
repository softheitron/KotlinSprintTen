package org.example.lesson_12

class DayWeather2(val dayTimeTemp: Int, val nightTimeTemp: Int, val isHavePrecipitation: Boolean) {

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
        dayTimeTemp = 12,
        nightTimeTemp = -2,
        isHavePrecipitation = true
    )

    day1.showDayWeather()

}
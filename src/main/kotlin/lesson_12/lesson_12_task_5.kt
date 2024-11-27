package org.example.lesson_12

const val KELVIN_ZERO_3 = 273

class DayWeather5(_dayTimeTemp: Int, _nightTimeTemp: Int, _isHavePrecipitation: Boolean) {
    val dayTimeTemp = (_dayTimeTemp - KELVIN_ZERO_3)
    val nightTimeTemp = (_nightTimeTemp - KELVIN_ZERO_3)
    val isHavePrecipitation = _isHavePrecipitation

    init {
        println(
            "Температура днем: $dayTimeTemp°C\n" +
                    "Температура ночью: $nightTimeTemp°C\n" +
                    "Наличие осадков: ${if (isHavePrecipitation) "Осадки есть" else "Осадков нет"}"
        )
    }

}

fun main() {

    val weatherList = mutableListOf<DayWeather5>()
    val randomTemperature = 243..313

    for (i in 1..30) {
        weatherList.add(
            DayWeather5(
                _dayTimeTemp = randomTemperature.random(),
                _nightTimeTemp = randomTemperature.random(),
                i % 3 == 0
            )
        )
    }

    val daysWithPrecipitations = weatherList.filter { it.isHavePrecipitation }.size
    val averageDayTemps = weatherList.map { it.dayTimeTemp }.average().toInt()
    val averageNightTemps = weatherList.map { it.nightTimeTemp }.average().toInt()

    println("\nСредняя температура днем(30 дней): $averageDayTemps°C\n" +
            "Средняя температура ночью(30 дней): $averageNightTemps°C\n" +
            "Количество дней с осадками(30 дней): $daysWithPrecipitations")

}

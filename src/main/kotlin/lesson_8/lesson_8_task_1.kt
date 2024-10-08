package org.example.lesson_8

fun main() {

    val mondayStatistic = 23800
    val tuesdayStatistic = 32000
    val wednesdayStatistic = 18900
    val thursdayStatistic = 23800
    val fridayStatistic = 68798
    val saturdayStatistic = 158000
    val sundayStatistic = 232800

    val weekStatisticsArray = intArrayOf(
        mondayStatistic,
        tuesdayStatistic,
        wednesdayStatistic,
        thursdayStatistic,
        fridayStatistic,
        saturdayStatistic,
        sundayStatistic
    )
    val weekStatisticSum = weekStatisticsArray.sum()

    print("Количество просмотров за неделю составило: $weekStatisticSum")

}
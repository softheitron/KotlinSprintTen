package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinutes = 47
    val timeToArriveInMinutes = 457

    var arriveHour = departureHour + timeToArriveInMinutes / 60
    val restMinutes = timeToArriveInMinutes - (timeToArriveInMinutes / 60 * 60)
    var arriveMinute = departureMinutes + restMinutes

    if (arriveMinute > 60) {
        arriveHour++
        arriveMinute -= 60
    }

    print("Train will arrive at $arriveHour:$arriveMinute")

}
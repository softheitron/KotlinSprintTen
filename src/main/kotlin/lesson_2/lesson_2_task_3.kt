package org.example.lesson_2

const val SECONDS_IN_MINUTE = 60
const val HOURS_IN_DAY = 24

fun main() {

    val departureHour = 9
    val departureMinutes = 47
    val timeToArriveInMinutes = 457

    val restMinutes = timeToArriveInMinutes % SECONDS_IN_MINUTE
    val hoursToArrive = (timeToArriveInMinutes / SECONDS_IN_MINUTE) + ((departureMinutes + restMinutes) / SECONDS_IN_MINUTE)
    val arriveMinute = (departureMinutes + restMinutes) % SECONDS_IN_MINUTE
    val arriveHour = (departureHour + hoursToArrive) % HOURS_IN_DAY

    print("Train will arrive at %02d:%02d"
        .format(arriveHour, arriveMinute))

}
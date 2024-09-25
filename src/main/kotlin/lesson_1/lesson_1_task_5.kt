package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * SECONDS_IN_MINUTE

fun main() {

    val secondsInSpace = 6480
    val hoursInSpace = secondsInSpace / SECONDS_IN_HOUR
    val secondsInSpaceAfterHours = secondsInSpace - hoursInSpace * SECONDS_IN_HOUR
    val minutesInSpace = secondsInSpaceAfterHours / SECONDS_IN_MINUTE
    val secondsInSpaceAfterMinutes = secondsInSpaceAfterHours - minutesInSpace * SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpaceAfterMinutes))

}
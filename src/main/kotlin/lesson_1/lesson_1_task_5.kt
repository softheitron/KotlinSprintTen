package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {

    val secondsInSpace = 6480
    val hoursInSpace = secondsInSpace / SECONDS_IN_HOUR
    val secondsInSpaceAfterHours = secondsInSpace - hoursInSpace * SECONDS_IN_HOUR
    val minutesInSpace = secondsInSpaceAfterHours / SECONDS_IN_MINUTE
    val secondsInSpaceAfterMinutes = secondsInSpaceAfterHours - minutesInSpace * SECONDS_IN_MINUTE

    print("${String.format("%02d", hoursInSpace)}:${String.format("%02d", minutesInSpace)}:${String.format("%02d", secondsInSpaceAfterMinutes)}")

}
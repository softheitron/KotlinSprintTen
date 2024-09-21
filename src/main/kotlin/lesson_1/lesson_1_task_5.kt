package org.example.lesson_1

fun main() {

    var secondsInSpace = 123023543
    val hoursInSpace = secondsInSpace/3600
    val secondsInSpaceAfterHours = secondsInSpace - hoursInSpace*3600
    val minutesInSpace = secondsInSpaceAfterHours/60
    val secondsInSpaceAfterMinutes = secondsInSpaceAfterHours - minutesInSpace*60

    print("${numFormatter(hoursInSpace)}:${numFormatter(minutesInSpace)}:${numFormatter(secondsInSpaceAfterMinutes)}")

}

fun numFormatter(num: Int): String {
    val formattedNum: String
    if (num.toString().length < 2) {
        formattedNum = "0$num"
    } else formattedNum = "$num"
    return formattedNum
}
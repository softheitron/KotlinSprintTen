package org.example.lesson_6

const val SECONDS_IN_MILLIS = 1000L

fun main() {

    print("Введите число для отсчета: ")
    val countdownInput = readln().toInt()
    val sleepTime = SECONDS_IN_MILLIS * countdownInput

    Thread.sleep(sleepTime)

    println("Прошло $countdownInput секунд")

}
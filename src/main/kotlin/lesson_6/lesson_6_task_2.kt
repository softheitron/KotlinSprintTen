package org.example.lesson_6

fun main() {

    print("Введите число для отсчета: ")
    val countdownInput = readln().toInt()
    var counter = countdownInput

    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }
    println("Прошло $countdownInput секунд")

}
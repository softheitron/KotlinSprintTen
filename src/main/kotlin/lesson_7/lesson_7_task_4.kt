package org.example.lesson_7

fun main() {

    print("Введите количество секунд для отсчета: ")
    val countdownInput = readln().toInt()

    for (i in countdownInput downTo 0) {
        if (i != 0) {
            println("Осталось секунд: $i")
            Thread.sleep(1000)
        } else print("Время вышло!")
    }

}
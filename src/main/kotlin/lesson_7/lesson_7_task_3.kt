package org.example.lesson_7

fun main() {

    print("Введите число: ")
    val numberInput = readln().toInt()
    val lastProgressionNumber = numberInput

    for(i in 0 .. lastProgressionNumber step 2) {
        println(i)
    }

}
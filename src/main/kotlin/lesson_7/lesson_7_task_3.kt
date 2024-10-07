package org.example.lesson_7

fun main() {

    print("Введите число: ")
    val numberInput = readln().toInt()

    for(i in 0 .. numberInput step 2) {
        println(i)
    }

}
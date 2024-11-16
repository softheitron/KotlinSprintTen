package org.example.lesson_20

fun main() {

    val list = listOf("first", "step", "always", "hard")

    val mappedList = list.map {
        { println("Нажат элемент $it") }
    }

    mappedList.forEachIndexed { index, function ->
        if ((index + 1) % 2 == 0 ) function()
    }

}
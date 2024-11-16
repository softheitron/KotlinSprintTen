package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    val evenList = this.filter { it % 2 == 0 }
    return evenList.sum()
}

fun main() {

    val listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    println(listInt.evenNumbersSum())

}
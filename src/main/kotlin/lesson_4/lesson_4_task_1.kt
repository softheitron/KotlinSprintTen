package org.example.lesson_4

const val CAFE_CAPACITY = 13

fun main() {

    val todayReservedTables = 13
    val tomorrowReservedTables = 9

    val availabilityOfTablesToday = todayReservedTables < CAFE_CAPACITY
    val availabilityOfTablesTomorrow = tomorrowReservedTables < CAFE_CAPACITY

    println(
        "Доступность столиков на сегодня: $availabilityOfTablesToday\n" +
        "Доступность столиков на завтра: $availabilityOfTablesTomorrow"
    )

}
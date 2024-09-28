package org.example.lesson_4

const val CORE_STRING = "Упражнение для персса: "
const val ARM_STRING = "Упражнение для рук: "
const val BACK_STRING = "Упражнение для спины: "
const val LEG_STRING = "Упражнение для ног: "

fun main() {

    val trainingDay = 5
    val isCoreAndArmDay = trainingDay % 2 != 0
    val isLegAndBackDay = !isCoreAndArmDay

    println(
        "%-25s %b\n%-25s %b\n%-25s %b\n%-25s %b".format(
            ARM_STRING, isCoreAndArmDay,
            LEG_STRING, isLegAndBackDay,
            BACK_STRING, isLegAndBackDay,
            CORE_STRING, isCoreAndArmDay
        ))

}
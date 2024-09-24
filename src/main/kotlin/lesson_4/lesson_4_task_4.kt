package org.example.lesson_4

const val CORE_STRING = "Упражнение для персса: "
const val ARM_STRING = "Упражнение для рук: "
const val BACK_STRING = "Упражнение для спины: "
const val LEG_STRING = "Упражнение для ног: "
const val LONGEST_MESSAGE = CORE_STRING.length

fun main() {

    val trainingDay = 5
    val coreAndArmDay = (trainingDay == 1 || trainingDay in 5..100 step 4)
    val legAndBackDay = (trainingDay == 3 || trainingDay in 7 .. 100 step 4)



    println(
        ARM_STRING + " ".repeat(LONGEST_MESSAGE - ARM_STRING.length) + "$coreAndArmDay\n" +
        LEG_STRING + " ".repeat(LONGEST_MESSAGE - LEG_STRING.length) + "$legAndBackDay\n" +
        BACK_STRING + " ".repeat(LONGEST_MESSAGE - BACK_STRING.length) + "$legAndBackDay\n" +
        CORE_STRING + " ".repeat(LONGEST_MESSAGE - CORE_STRING.length) + "$coreAndArmDay"
    )

}
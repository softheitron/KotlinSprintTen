package org.example.lesson_2

const val PERCENTAGE_RATE = 100f

fun main() {

    val crystalOreMined = 10
    val ironOreMined = 11
    val buff = 20

    val crystalOreWithBuff = crystalOreMined * (buff / PERCENTAGE_RATE)
    val ironOreWithBuff = ironOreMined * (buff / PERCENTAGE_RATE)

    println(crystalOreWithBuff.toInt())
    println(ironOreWithBuff.toInt())

}
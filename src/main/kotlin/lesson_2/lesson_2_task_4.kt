package org.example.lesson_2

fun main() {

    val crystalOreMined = 7
    val ironOreMined = 11
    val buff = 0.20f

    val crystalOreWithBuff = crystalOreMined * buff
    val ironOreWithBuff = ironOreMined * buff

    println(crystalOreWithBuff.toInt())
    println(ironOreWithBuff.toInt())

}
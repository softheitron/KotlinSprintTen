package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val startInvest = 70000
    val interestRate = 0.167
    val years = 20


    val total = startInvest * (1 + interestRate).pow(years)

    println(String.format("%.3f", total))

}
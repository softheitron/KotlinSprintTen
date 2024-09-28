package org.example.lesson_2

import kotlin.math.pow

const val PERCENTAGE_RATE = 100

fun main() {

    val startInvest = 70000
    val interestRate = 16.7
    val years = 20
    val compoundInterestRate = (1 + (interestRate / PERCENTAGE_RATE)).pow(years)

    val total = startInvest * compoundInterestRate

    println(String.format("%.3f", total))

}
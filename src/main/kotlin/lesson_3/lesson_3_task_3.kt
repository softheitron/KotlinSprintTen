package org.example.lesson_3

fun main() {

    print("Enter a number: ")
    val userInput = readln().toInt()

    val multiplicationTable = """
        $userInput * 1 = ${userInput * 1}
        $userInput * 2 = ${userInput * 2}
        $userInput * 3 = ${userInput * 3}
        $userInput * 4 = ${userInput * 4}
        $userInput * 5 = ${userInput * 5}
        $userInput * 6 = ${userInput * 6}
        $userInput * 7 = ${userInput * 7}
        $userInput * 8 = ${userInput * 8}
        $userInput * 9 = ${userInput * 9}
    """.trimIndent()

    println(multiplicationTable)

}
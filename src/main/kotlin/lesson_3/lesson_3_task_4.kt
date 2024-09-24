package org.example.lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = "1st"

    var moveInformation = "From $moveFrom, to $moveTo, $moveNumber move"

    println(moveInformation)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = "2nd"

    moveInformation = "From $moveFrom, to $moveTo, $moveNumber move"

    println(moveInformation)

}
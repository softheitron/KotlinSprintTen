package org.example.lesson_3

fun main() {

    val moveInformation = "D2-D4;0"

    val splitMoveInformation = moveInformation.split("-", ";")
    val moveFrom = splitMoveInformation.first()
    val moveTo = splitMoveInformation[1]
    val moveNumber = splitMoveInformation.last()

    val parsedMoveInformation = """
        
        Move from: $moveFrom
        Move to: $moveTo
        Move number: $moveNumber
        
    """.trimIndent()

    print(parsedMoveInformation)

}
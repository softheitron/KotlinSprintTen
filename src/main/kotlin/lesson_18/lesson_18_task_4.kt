package org.example.lesson_18

abstract class Box {
    abstract fun calculateArea(): Double
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
): Box() {
    override fun calculateArea(): Double {
        return 2 * ((length * width) + (length * height) + (width * height))
    }
}

class Cube(
    private val edge: Double
): Box() {
    override fun calculateArea(): Double {
        return 6 * (edge * edge)
    }
}

fun main() {

    val rectangleBox = RectangleBox(5.0, 12.0, 112.0)
    val cubeBox = Cube(6.0)

    println(rectangleBox.calculateArea())
    println(cubeBox.calculateArea())

}
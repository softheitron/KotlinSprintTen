package org.example.lesson_14

const val PI: Float = 3.14F

abstract class Figure(val color: String) {

    abstract fun calculatePerimeter(): Float
    abstract fun calculateArea() : Float

}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun calculatePerimeter(): Float {
        return (2 * PI * radius)
    }

    override fun calculateArea(): Float {
        return (PI * (radius * radius))
    }

}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun calculatePerimeter(): Float {
        return (2 * (width + height)).toFloat()
    }

    override fun calculateArea(): Float {
        return (width * height).toFloat()
    }

}

fun main() {

    val circle1 = Circle("black", 5)
    val circle2 = Circle("white", 3)

    val rectangle1 = Rectangle("black", 10, 8)
    val rectangle2 = Rectangle("white", 6, 3)

    val figureList = listOf(circle1, rectangle1, rectangle2, circle2)

    val blackPiece = figureList.find { it.color == "black" }

    println(blackPiece?.calculateArea())

}
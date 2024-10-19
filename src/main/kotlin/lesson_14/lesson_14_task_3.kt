package org.example.lesson_14

const val PI: Double = 3.14
const val BLACK_COLOR = "black"
const val WHITE_COLOR = "white"

abstract class Figure(val color: String) {

    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double

}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun calculatePerimeter(): Double {
        return (2 * PI * radius)
    }

    override fun calculateArea(): Double {
        return (PI * (radius * radius))
    }

}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun calculatePerimeter(): Double {
        return (2 * (width + height)).toDouble()
    }

    override fun calculateArea(): Double {
        return (width * height).toDouble()
    }

}

fun main() {

    val circle1 = Circle(BLACK_COLOR, 5)
    val circle2 = Circle(WHITE_COLOR, 3)

    val rectangle1 = Rectangle(BLACK_COLOR, 10, 8)
    val rectangle2 = Rectangle(WHITE_COLOR, 6, 3)

    val figureList = listOf(circle1, rectangle1, rectangle2, circle2)

    val blackPerimeterSum = figureList.filter { it.color == BLACK_COLOR }.sumOf { it.calculatePerimeter() }
    val whiteAreaSum = figureList.filter { it.color == WHITE_COLOR }.sumOf { it.calculateArea() }

    println(
        "Сумма площадей белых фигур: $whiteAreaSum\n" +
                "Сумма периметров черных фигур: $blackPerimeterSum"
    )

}
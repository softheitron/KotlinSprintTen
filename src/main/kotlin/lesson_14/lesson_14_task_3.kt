package org.example.lesson_14

const val PI: Double = 3.14

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

    val circle1 = Circle("black", 5)
    val circle2 = Circle("white", 3)

    val rectangle1 = Rectangle("black", 10, 8)
    val rectangle2 = Rectangle("white", 6, 3)

    val figureList = listOf(circle1, rectangle1, rectangle2, circle2)

    val blackPerimeterSum = figureList.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    val whiteAreaSum = figureList.filter { it.color == "white" }.sumOf { it.calculateArea() }

    println(
        "Сумма площадей белых фигур: $whiteAreaSum\n" +
                "Сумма периметров черных фигур: $blackPerimeterSum"
    )
}
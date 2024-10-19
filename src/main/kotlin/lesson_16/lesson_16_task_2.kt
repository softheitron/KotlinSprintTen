package org.example.lesson_16

private const val PI = 3.14

class Circle(private val radius: Int) {

    fun calculateCircumference(): Double {
        return PI * (radius * 2)
    }

    fun calculateArea(): Double {
        return PI * (radius * radius)
    }

}

fun main() {

    val circle = Circle(4)

    println(
        "Длина окружности: ${circle.calculateCircumference()}\n" +
                "Площадь: ${circle.calculateArea()}"
    )

}
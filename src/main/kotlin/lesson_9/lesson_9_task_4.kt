package org.example.lesson_9

fun main() {

    print("Введите пять ингредиентов перечисленных через запятую: ")
    val ingredientsInput = readln()

    val listOfIngredients = ingredientsInput.split(", ")

    println(listOfIngredients.sorted())

}
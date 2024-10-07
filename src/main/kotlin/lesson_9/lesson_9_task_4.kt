package org.example.lesson_9

fun main() {

    print("Введите пять ингредиентов перечисленных через запятую: ")
    val ingredientsInput = readln()

    val listOfIngredients = ingredientsInput.split(", ")

    if (listOfIngredients.size == 5) {
        println(listOfIngredients.sorted())
    } else {
        println("Нужно ввести ровно пять ингредиентов!")
    }

}
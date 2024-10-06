package org.example.lesson_8

fun main() {

    val recipeIngredients = arrayOf("помидор", "яйцо", "соль", "перец", "масло", "лук")

    print("Введите название ингредиента для поиска в рецепте: ")
    val ingredientInput = readln()

    if (ingredientInput in recipeIngredients) {
        println("Ингредиент ${ingredientInput.lowercase()} в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}
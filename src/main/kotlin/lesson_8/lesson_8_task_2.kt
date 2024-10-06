package org.example.lesson_8

fun main() {

    val recipeIngredients = arrayOf("помидор", "яйцо", "соль", "перец", "масло", "лук")

    print("Введите название ингредиента для поиска в рецепте: ")
    val ingredientInput = readln()

    for (i in recipeIngredients) {
        if (i == ingredientInput.lowercase()) {
            println("Ингредиент $i в рецепте есть")
            break
        } else if(i == recipeIngredients.last()) {
            println("Такого ингредиента в рецепте нет")
        }
    }

}
package org.example.lesson_8

fun main() {

    val recipeIngredients = arrayOf("помидор", "яйцо", "соль", "перец", "масло", "лук")
    print("Список ингредиентов: ")
    recipeIngredients.forEach {
        print("$it; ")
    }

    print("\nВведите ингредиент для замены: ")
    val changeIngredientInput = readln()

    if (recipeIngredients.contains(changeIngredientInput.lowercase())) {
        print("Введите название игредиента для замены: ")
        val newIngredientInput = readln()
        val replacedIngredientIndex = recipeIngredients.indexOf(changeIngredientInput.lowercase())
        recipeIngredients[replacedIngredientIndex] = newIngredientInput
    } else {
        println("Нет такого ингредиента в рецепте")
        return
    }

    print("Обновленный список ингредиентов: ")
    recipeIngredients.forEach {
        print("$it; ")
    }

}
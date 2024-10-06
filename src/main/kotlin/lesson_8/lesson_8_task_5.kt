package org.example.lesson_8

fun main() {

    print("Выберите желаемое количество ингредиентов в рецепте: ")
    val ingredientsAmount = readln().toInt()

    val recipeArray = Array(ingredientsAmount) {
        print("Введите ${it + 1}й ингредиент: ")
        val addIngredientInput = readln()
        var ingredientToAdd = addIngredientInput
        if (it < (ingredientsAmount - 1)) {
            ingredientToAdd += ", "
        }
        ingredientToAdd.lowercase()
    }

    print("Созданный список ингредиентов: ")
    recipeArray.forEach {
        print(it)
    }

}
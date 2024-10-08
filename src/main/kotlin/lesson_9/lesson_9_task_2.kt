package org.example.lesson_9

fun main() {

    val ingredientsList = mutableListOf("яйцо", "лук", "сыр")
    println("В рецепте есть базовые ингредиенты:\n$ingredientsList")

    print("Желаете ли вы добавить новый ингредиент к списку?" +
            " Ответьте \"Да\" или \"Нет\"\nВаш ответ: ")
    val answerInput = readln()

    if (answerInput.lowercase() == "да") {
        print("Введите название ингредиента: ")
        val newIngredientInput = readln()
        ingredientsList.add(newIngredientInput.lowercase())
    } else {
        println("Очень жаль.\nЖдем вашего возвращения!")
        return
    }

    print("Теперь в рецепте есть следующие ингредиенты:\n$ingredientsList")

}
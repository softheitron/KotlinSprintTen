package org.example.lesson_9

const val INGREDIENTS_AMOUNT = 5

fun main() {

    println("Введите 5 ингредиентов")
    var ingredientInput: String
    val ingredientsList = mutableListOf<String>()

    for (i in 1..INGREDIENTS_AMOUNT) {
        print("Введите ${i}й ингредиент: ")
        ingredientInput = readln()
        ingredientsList.add(ingredientInput)
    }

    val sortedIngredientsList = ingredientsList.toSet().sorted()

    print("Список ингредиентов: ")
    sortedIngredientsList.forEach {
        when(it) {
            sortedIngredientsList.first() -> {
                print("%s, ".format(
                    it.replaceFirstChar { firstLetter ->
                        firstLetter.uppercase()
                    }))
            }
            sortedIngredientsList.last() -> print("%s".format(it))
            else -> print("%s, ".format(it))
        }
    }

}
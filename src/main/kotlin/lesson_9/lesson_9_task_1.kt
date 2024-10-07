package org.example.lesson_9

fun main() {

    val recipeList = listOf("помидор", "яйцо", "соль", "перец", "масло", "лук")

    println("В рецепте есть следующие ингредиенты: $recipeList")

    recipeList.forEach {
        println(it)
    }

}
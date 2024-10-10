package org.example.lesson_11

class Categories(
    val name: String,
    val coverPhoto: String,
    val recipePhoto: String,
    val about: String,
    val recipeName: String,
)

class RecipeList(
    val coverPhoto: String,
    val recipePhoto: String,
    val name: String,
)

class Recipe(
    val name: String,
    val portionAmount: Int,
    val ingredients: Ingredients,
    val howToCook: String,
)

class Ingredients(
    val name: String,
    val amount: Int,
)
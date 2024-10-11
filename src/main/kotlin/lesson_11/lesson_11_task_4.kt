package org.example.lesson_11

class Category(
    val name: String,
    val coverPhoto: String,
    val recipePhoto: String,
    val about: String,
    val recipeList: List<Recipe>
)

class Recipe(
    val id: Int,
    val name: String,
    val coverPhoto: String,
    val portionAmount: Int,
    val ingredients: Ingredients,
    val howToCook: List<String>
)

class Ingredients(
    val name: String,
    val amount: Int,
    val measure: String
)
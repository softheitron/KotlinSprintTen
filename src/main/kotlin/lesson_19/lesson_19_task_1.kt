package org.example.lesson_19

enum class Fishes(val cyrillic: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Рыба-Ангел"),
    GOLDFISH("Золотая Рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {

    Fishes.entries.forEach {
        println("${it.name} (${it.cyrillic})")
    }

}
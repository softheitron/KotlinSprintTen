package org.example.lesson_19

enum class Fishes {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {

    Fishes.entries.forEach {
        println(it.name)
    }

}
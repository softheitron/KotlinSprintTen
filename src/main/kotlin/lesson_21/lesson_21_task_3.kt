package org.example.lesson_21

class Player2(
    val name: String,
    var currentHealth: Double,
    val maxHealth: Double,
)

fun Player2.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun main() {

    val player = Player2(
        "Gordon",
        100.0,
        100.0,
    )

    println(player.isHealthy())

}



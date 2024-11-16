package org.example.lesson_20

const val POTION_HEAL = 20.0

class Player(
    val name: String,
    var currentHealth: Double,
    val maxHealth: Double,
) {
    fun showPlayerInfo() {
        println("Имя: $name\n" +
                "Текущее здоровье: $currentHealth\n" +
                "Максимальное здоровье: $maxHealth")
    }
}

fun main() {

    val healthPotion: (player: Player) -> Unit = {
        if (it.currentHealth < it.maxHealth && (it.currentHealth + POTION_HEAL) < it.maxHealth) {
            it.currentHealth += POTION_HEAL
        } else {
            it.currentHealth = it.maxHealth
        }
    }

    val player1 = Player("Gordon", 66.0, 100.0)
    player1.showPlayerInfo()
    healthPotion(player1)
    player1.showPlayerInfo()
    healthPotion(player1)
    player1.showPlayerInfo()

}
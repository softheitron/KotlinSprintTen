package org.example.lesson_20

class Player1(
    var isHaveKey: Boolean = false
)

fun choseRandomChest(playerInput: Int?): Boolean {
    val randomChose = (1..3).random()
    return playerInput == randomChose
}

fun main() {

    val accessStatus: (player: Player1) -> String = {
        if (it.isHaveKey) "Дверь открыта!" else "Дверь заперта"
    }

    val player = Player1()

    do {
        print(
            "Выберите номер сундука(в одном из них ключ)\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "Выбор: "
        )
        val choseInput = readln().toIntOrNull()
        if (choseRandomChest(choseInput)) {
            println("Ключ найден!")
            player.isHaveKey = true
        } else println("Пусто!")
        println(accessStatus(player))
    } while (!player.isHaveKey)

}
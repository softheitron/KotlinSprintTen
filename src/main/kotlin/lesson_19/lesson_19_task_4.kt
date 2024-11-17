package org.example.lesson_19

enum class Ammunition(val id: Int? = null, val damage:Int) {
    BLUE(1, 5),
    GREEN(2, 10),
    RED(3, 20),
}

class Tank {

    private var currentAmmunition: Ammunition? = null

    fun fire() {
        if (currentAmmunition != null) {
            println("Выстрел произведен\nНанесено урона: ${currentAmmunition?.damage}")
        } else println("Орудие не заряжено")
    }

    fun loadAmmunition() {
        print("Выберите чем зарядить орудие(или Enter что бы ничего не заряжать):\n" +
                "1.${Ammunition.BLUE.name}(${Ammunition.BLUE.damage} урона)\n" +
                "2.${Ammunition.GREEN.name}(${Ammunition.GREEN.damage} урона)\n" +
                "3.${Ammunition.RED.name}(${Ammunition.RED.damage} урона)\n" +
                "Ваш выбор: ")
        val choseAmmunitionInput = readln().toIntOrNull()
        when(choseAmmunitionInput) {
            Ammunition.BLUE.id -> currentAmmunition = Ammunition.BLUE
            Ammunition.GREEN.id -> currentAmmunition = Ammunition.GREEN
            Ammunition.RED.id -> currentAmmunition = Ammunition.RED
            null -> return
            else -> println("Неверный ввод")
        }
    }

}

fun main() {

    val tank1 = Tank()

    tank1.fire()
    tank1.loadAmmunition()
    tank1.fire()

}
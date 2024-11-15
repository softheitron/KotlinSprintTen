package org.example.lesson_19

enum class Ammunition(val id: Int? = null) {
    BLUE(1) {
        override fun showDamage(): String {
            return "Нанесено 5 урона"
        }
    },
    GREEN(2) {
        override fun showDamage(): String {
            return "Нанесено 10 урона"
        }
    },
    RED(3) {
        override fun showDamage(): String {
            return "Нанесено 20 урона"
        }
    },
    EMPTY(0) {
        override fun showDamage(): String {
            return "Орудие не заряжено"
        }
    },
    ERROR() {
        override fun showDamage(): String {
            return "Произошла ошибка!"
        }
    };

    abstract fun showDamage(): String
}

class Tank {

    private var currentAmmunition: Ammunition = Ammunition.EMPTY

    fun fire() {
        if (currentAmmunition != Ammunition.EMPTY) {
            println("Выстрел произведен\n" + currentAmmunition.showDamage())
        } else println(currentAmmunition.showDamage())
    }

    fun loadAmmunition() {
        print("Выберите чем зарядить орудие:\n" +
                "1.Синий(5 урона)\n" +
                "2.Зеленый(10 урона)\n" +
                "3.Красный(20 урона)\n" +
                "0.Ничем не заряжать(текущий патрон остается)\n" +
                "Ваш выбор: ")
        val choseAmmunitionInput = readln().toIntOrNull()
        when(choseAmmunitionInput) {
            Ammunition.BLUE.id -> currentAmmunition = Ammunition.BLUE
            Ammunition.GREEN.id -> currentAmmunition = Ammunition.GREEN
            Ammunition.RED.id -> currentAmmunition = Ammunition.RED
            Ammunition.EMPTY.id -> {
                if (isLoaded(currentAmmunition)) {
                    print("Разрядить или оставить патрон?\n" +
                            "1.Разрядить\n" +
                            "2.Оставить\n" +
                            "0.Назад\n" +
                            "Ваш выбор: ")
                    val choseInput = readln()
                    when(choseInput.trim()) {
                        "1" -> currentAmmunition = Ammunition.EMPTY
                        "2" -> return
                        "0" -> loadAmmunition()
                        else -> {
                            println("Неизвестный выбор")
                            return
                        }
                    }
                }
            }
            else -> println(Ammunition.ERROR.showDamage())
        }
    }
    private fun isLoaded(ammunition: Ammunition): Boolean {
        return ammunition != Ammunition.EMPTY
    }
}

fun main() {

    val tank1 = Tank()
    val tank2 = Tank()

    tank1.fire()
    tank1.loadAmmunition()
    tank1.fire()
    tank2.loadAmmunition()
    tank2.fire()
    tank2.loadAmmunition()
    tank2.fire()

}
package org.example.lesson_4

const val DAMAGE_PRESENCE = false
const val REQUIRED_PROVISION = 50
const val REQUIRED_MIN_TEAM = 55
const val REQUIRED_MAX_TEAM = 70
const val REQUIRED_WEATHER_CONDITION = true


fun main() {

    print(
        "Выберите состояние корпуса корабля:\n" +
                "1.Повреждения отсутствуют\n" +
                "2.Имеются незначительные повреждения\n" +
                "Ввод: "
    )
    val chooseDamageAmount = readln()
    val isHavingDamage = when (chooseDamageAmount) {
        "1" -> false
        "2" -> true
        else -> {
            print("Неверный выбор, перезапустите программу проверки!")
            return
        }
    }

    print("Введите оличество экипажа корабля: ")
    val teamQuantityInput = readln().toInt()

    print("Выберите количество ящиков с провизией: ")
    val provisionQuantityInput = readln().toInt()

    print(
        "Выберите благоприятность метеоусловий:\n" +
                "1.Благоприятные метеоусловия\n" +
                "2.Неблагоприятные метеоусловия\n" +
                "Ввод: "
    )
    val chooseWeatherCondition = readln()
    val isWeatherConditionFavorable = when (chooseWeatherCondition) {
        "1" -> true
        "2" -> false
        else -> {
            print("Неверный выбор, перезапустите программу проверки!")
            return
        }
    }

    val isShipReadyToSail =
        (isHavingDamage == DAMAGE_PRESENCE &&
                teamQuantityInput in REQUIRED_MIN_TEAM..REQUIRED_MAX_TEAM &&
                provisionQuantityInput > REQUIRED_PROVISION) ||
                (isHavingDamage != DAMAGE_PRESENCE &&
                        teamQuantityInput == REQUIRED_MAX_TEAM &&
                        isWeatherConditionFavorable == REQUIRED_WEATHER_CONDITION &&
                        provisionQuantityInput > REQUIRED_PROVISION)

    print(
        when(isShipReadyToSail) {
            true -> "Все условия соблюдены. Корбаль может отправляться в путь!"
            false -> "Условия не соблюдены! Корабль остается в гавани..."
        }
    )

}
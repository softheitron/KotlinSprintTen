package org.example.lesson_4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME_MAX = 100

fun main() {

    var cargoWeight = 50
    var cargoVolume = 80

    println(
        "Груз с весом ${cargoWeight}кг и объемом ${cargoVolume}л соответствует категории - \"Average\":"
        +
        "${((cargoWeight > AVERAGE_WEIGHT_MIN) && (cargoWeight <= AVERAGE_WEIGHT_MAX)) && (cargoVolume < AVERAGE_VOLUME_MAX)}"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом ${cargoWeight}кг и объемом ${cargoVolume}л соответствует категории - \"Average\":"
                +
                "${((cargoWeight > AVERAGE_WEIGHT_MIN) && (cargoWeight <= AVERAGE_WEIGHT_MAX)) && (cargoVolume < AVERAGE_VOLUME_MAX)}"
    )

}
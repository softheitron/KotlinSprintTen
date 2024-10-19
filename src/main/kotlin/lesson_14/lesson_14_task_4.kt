package org.example.lesson_14

abstract class CelestialBodies(
    val name: String,
    val atmosphere: Boolean,
    val fitForLanding: Boolean,
) {
    abstract fun showInformationAboutObject()
}

class Planet(name: String, atmosphere: Boolean, fitForLanding: Boolean) : CelestialBodies(name, atmosphere, fitForLanding) {

    private val satelliteList = mutableListOf<Satellite>()

    override fun showInformationAboutObject() {
        println("Название планеты: $name\n" +
                "Наличие атмосферы: ${if (atmosphere) "есть" else "нету"}\n" +
                "Пригодность к высадке: ${if (fitForLanding) "пригоден" else "непригоден"}\n" +
                "Количество спутников: ${satelliteList.size}")
        if (satelliteList.isNotEmpty()) {
            println("Информация о спутниках данной планеты:\n" +
                    "--------------------------------")
            satelliteList.forEach {
                it.showInformationAboutObject()
                println("--------------------------------")
            }
        }
    }

    fun addSatelliteToOrbit(name: String, atmosphere: Boolean, fitForLanding: Boolean) {
        if (name.trim() == "") {
            satelliteList.add(Satellite(
                name = "nameless",
                atmosphere = atmosphere,
                fitForLanding = fitForLanding
            ))
        } else {
            satelliteList.add(Satellite(
                name = name,
                atmosphere = atmosphere,
                fitForLanding = fitForLanding
            ))
        }
    }

}

class Satellite(name: String, atmosphere: Boolean, fitForLanding: Boolean) : CelestialBodies(name, atmosphere, fitForLanding) {
    override fun showInformationAboutObject() {
        println("Название спутника: $name\n" +
                "Наличие атмосферы: ${if (atmosphere) "есть" else "нету"}\n" +
                "Пригодность к высадке: ${if (fitForLanding) "пригоден" else "непригоден"}")
    }
}

fun main() {

    val planet1 = Planet(
        name = "Saturn",
        atmosphere = true,
        fitForLanding = false
    )

    planet1.addSatelliteToOrbit(
        name = "Titan",
        atmosphere = true,
        fitForLanding = true
    )
    planet1.addSatelliteToOrbit(
        name = "Diona",
        atmosphere = false,
        fitForLanding = false
    )

    planet1.showInformationAboutObject()

}
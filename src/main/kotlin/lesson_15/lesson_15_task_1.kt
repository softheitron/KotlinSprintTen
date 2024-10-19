package org.example.lesson_15

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Duck() : Flyable, Swimmable {
    override fun swim() {
        println("Утка плывет")
    }

    override fun fly() {
        println("Утка летит")
    }
}

class Seagull() : Flyable, Swimmable {
    override fun swim() {
        println("Чайка плывет")
    }

    override fun fly() {
        println("Чайка летит")
    }

}

class Carp() : Swimmable {
    override fun swim() {
        println("Карась плывет")
    }
}


fun main() {

    val duck1 = Duck()
    val carp1 = Carp()
    val seagull1 = Seagull()

    duck1.fly()
    duck1.swim()

    carp1.swim()

    seagull1.fly()
    seagull1.swim()

}
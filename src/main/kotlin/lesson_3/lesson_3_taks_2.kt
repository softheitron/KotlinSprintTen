package org.example.lesson_3

fun main() {

    val userName = "Татьяна"
    var userSurname = "Андреева"
    val userPatronymic = "Сергеевна"
    var userAge = 20

    println("$userSurname $userName $userPatronymic, $userAge")

    userSurname = "Сидорова"
    userAge = 22

    println("$userSurname $userName $userPatronymic, $userAge")

}
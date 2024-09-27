package org.example.lesson_5

const val CURRENT_YEAR = 2024
const val AGE_OF_MAJORITY = 18

fun main() {

    println("Что бы продолжить просмотр данного контента, вам нужно подтвердить ваш возраст")

    print("Введите свой год рождения: ")
    val userAge = readln().toInt()

    val accessMessage =  if ((CURRENT_YEAR - userAge) >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else "Доступ к показу скрытого контента отклонен ввиду несовершеннолетия юзера"

    print(accessMessage)

}
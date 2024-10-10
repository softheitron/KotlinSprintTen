package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {

    val user1 = User(
        id = 1,
        login = "someLogin",
        password = "somePassword",
        email = "someEmail@mail.ru"
    )
    val user2 = User(
        id = 2,
        login = "anotherLogin",
        password = "anotherPassword",
        email = "anotherEmail@gmail.com"
    )

    println("Id : ${user1.id}")
    println("LogIn : ${user1.login}")
    println("Password : ${user1.password}")
    println("E-Mail : ${user1.email}")

    println()

    println("Id : ${user2.id}")
    println("LogIn : ${user2.login}")
    println("Password : ${user2.password}")
    println("E-Mail : ${user2.email}")

}


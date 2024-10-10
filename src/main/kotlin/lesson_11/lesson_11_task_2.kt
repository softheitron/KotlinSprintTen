package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {

    fun showUserInformation() {
        println("Id : $id\n" +
                "LogIn : $login\n" +
                "Password : $password\n" +
                "E-Mail : $email\n" +
                "Bio : $bio")
    }

    fun fillInBio() {
        print("Заполните информацию о себе: ")
        val bioInput = readln()
        bio = bioInput
    }

    fun changePassword() {
        print("Введите старый пароль: ")
        val actualPasswordInput = readln()
        if (password == actualPasswordInput) {
            print("Введите новый пароль: ")
            val newPasswordInput = readln()
            password = newPasswordInput
        }
    }

}

fun main() {

    val user = User2(
        id = 1,
        login = "User",
        password = "password",
        email = "mail@gmail.com"
    )

    user.showUserInformation()
    user.fillInBio()
    user.changePassword()
    user.showUserInformation()

}
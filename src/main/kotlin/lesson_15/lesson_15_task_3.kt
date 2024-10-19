package org.example.lesson_15


abstract class ForumUser {

    abstract val name : String

    fun readForum() {
        println("Пользователь $name читает сообщения на форуме:")
    }

    fun writeMessage(message: String) {
        println("Пользователь $name написал на форум: $message")
    }

}

class RegularUser(override val name: String) : ForumUser()

class Administrator(override val name: String) : ForumUser() {

    fun deleteMessage(message: String) {
        println("Администратор удалил сообщение: $message")
    }

    fun deleteUser(user: ForumUser) {
        println("Администратор удалил пользователя ${user.name}")
    }

}

fun main() {

    val user1 = RegularUser("John")
    val admin1 = Administrator("Vasya")

    user1.writeMessage("бла-бла-бла")
    admin1.writeMessage("так писать нельзя")
    admin1.readForum()
    admin1.deleteMessage("бла-бла-бла")
    admin1.readForum()

    admin1.deleteUser(user1)

}
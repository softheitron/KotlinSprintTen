package org.example.lesson_11

class ForumUser(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String
)

class Forum {

    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var newUserId = 1

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(newUserId, userName)
        users.add(newUser)
        newUserId++
        return newUser
    }

    fun createForumMessage(authorId: Int): ForumMessage? {
        val author = users.find { it.userId == authorId }
        return if (author != null) {
            print("Введите сообщение: ")
            val messageInput = readln()
            val newMessage = ForumMessage(authorId, messageInput)
            messages.add(newMessage)
            newMessage
        } else {
            println("Юзера с таким id не существует")
            null
        }
    }

    fun printThread() {
        for(message in messages) {
            val author = users.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName}: ${message.message}")
            }
        }
    }

}

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("David")
    val user2 = forum.createNewUser("Vladimir")
    val user3 = forum.createNewUser("Julia")

    forum.createForumMessage(user1.userId)
    forum.createForumMessage(user2.userId)
    forum.createForumMessage(user1.userId)
    forum.createForumMessage(user3.userId)
    forum.createForumMessage(user2.userId)
    forum.createForumMessage(user1.userId)

    forum.printThread()

}
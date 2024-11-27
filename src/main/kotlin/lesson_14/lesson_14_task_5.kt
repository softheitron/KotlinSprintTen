package org.example.lesson_14

class Chat {

    private var id = 1
    private val messages = mutableListOf<Message>()
    private val threadMessages = mutableListOf<ChildMessage>()

    fun addMessage(content: String, author: String) {
        messages.add(
            Message(
                id = id,
                author = author,
                content = content
            )
        )
        id++
    }

    fun addThreadMessage(content: String, author: String) {
        val groupedMessages = messages.groupBy { it.id }
        print("Введите id сообщения для ответа: ")
        val parentIdInput = readln().toIntOrNull()
        if (groupedMessages.containsKey(parentIdInput) && parentIdInput != null) {
            threadMessages.add(
                ChildMessage(
                    parentId = parentIdInput,
                    author = author,
                    content = content
                )
            )
        } else println("Сообщения с таким id не существует")
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { it.id }
        val groupedThread = threadMessages.groupBy { it.parentId }

        groupedMessages.forEach { (id, message) ->
            println("Name: ${message[0].author} id - $id\n" +
                    "Message: ${message[0].content}\n")

            if(groupedThread.containsKey(id)){
                groupedThread[id]?.forEach {
                    println("     Name: ${it.author}\n" +
                            "     Message: ${it.content}\n")

                }
            } else {
                println()
            }
        }

    }

}

class Message(
    val id: Int,
    val author: String,
    val content: String
)

class ChildMessage(
    val parentId: Int,
    val author: String,
    val content: String,
)

fun main() {

    val chat = Chat()

    chat.addMessage("Hello world", "David")
    chat.addThreadMessage("Welcome", "Gaga")
    chat.addMessage("Hi everyone", "Andrew")
    chat.addThreadMessage("New here?", "Old")
    chat.addMessage("I'am here!", "Philip")
    chat.addThreadMessage("Lalala", "Dumbass")

    chat.printChat()

}
package org.example.lesson_20

fun main() {

    val welcomeText: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }

    println(welcomeText("Garry"))

}
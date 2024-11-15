package org.example.lesson_17

class Quiz(question: String, answer: String) {

    val question = question
        get() {
            println("Новый вопрос: $field")
            return field
        }

    var answer = answer
        get() {
            println("Ответ: $field")
            return field
        }
        set(value) {
            println("Измененный ответ: $value")
            field = value
        }
}

fun main() {

    val quiz = Quiz("Какой то вопрос", "Какой то ответ")

    quiz.question
    quiz.answer
    quiz.answer = "Другой ответ"
    quiz.answer

}
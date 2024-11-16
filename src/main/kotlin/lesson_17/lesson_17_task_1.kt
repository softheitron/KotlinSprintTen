package org.example.lesson_17

class Quiz(question: String, answer: String) {

    val question = question
        get() {
            return field
        }

    var answer = answer
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

fun main() {

    val quiz = Quiz("Какой то вопрос", "Какой то ответ")

    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "Другой ответ"
    println(quiz.answer)

}
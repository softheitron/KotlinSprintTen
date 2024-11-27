package org.example.lesson_13

class Contact5(val name: String, val number: Long, val company: String? = null) {
    fun showContactInformation() {
        println(
            "Имя: $name\n" +
                    "Номер: ${number}\n" +
                    "Компания: ${company ?: "не указано"}"
        )
    }
}

fun main() {

    val name = "David"
    val company = "Company"
    val numberInput = readln()

    try {
        val contact = Contact5(name = name, company = company, number = numberInput.toLong())
        contact.showContactInformation()
    } catch (e: Exception) {
        println("Неверный формат - ${e.message}")
    }

    println("Продолжение работы программы")

}
package org.example.lesson_13

class Contact2(val name: String, val number: Long, val company: String? = null) {
    fun showContactInformation() {
        println(
            "Имя: $name\n" +
                    "Номер: $number\n" +
                    "Компания: ${company ?: "не указано"}"
        )
    }
}

fun main() {

    val contact1 = Contact2(
        "David",
        88005553535,
    )
    contact1.showContactInformation()

    val contact2 = Contact2(
        "Andrey",
        8985554444,
        "CyberSecurity"
    )
    contact2.showContactInformation()

}
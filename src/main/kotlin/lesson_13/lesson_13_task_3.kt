package org.example.lesson_13

class Contact3(
    val name: String,
    val number: Long,
    val company: String? = null,
)

fun main() {

    val contactList = listOf(
        Contact3(
            "David",
            88005553535,
            null
        ),
        Contact3(
            "Andrey",
            88005553535,
            null
        ),
        Contact3(
            "Ivan",
            88005553535,
            "null"
        ),
        Contact3(
            "Dmitriy",
            88005553535,
            "Nameless Company"
        ),
        Contact3(
            "Vladimir",
            88005553535,
            "Company Name"
        )
    )

    contactList.forEach {
        if (it.company != null) {
            println("Название компании: ${it.company}")
        }
    }

}
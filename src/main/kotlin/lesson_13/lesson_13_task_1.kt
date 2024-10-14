package org.example.lesson_13

class Contact(
    val name: String,
    val number: Long,
    val company: String?,
)

fun main() {

    val contact1 = Contact(
        "David",
        88005553535,
        null
    )

    val contact2 = Contact(
        "Andrey",
        89895554444,
        "WTCompany"
    )

    println(contact1.name)
    println(contact1.number)
    println(contact1.company)

    println(contact2.name)
    println(contact2.number)
    println(contact2.company)

}
package org.example.lesson_13

class Contact4(val name: String, val number: Long? = null, val company: String? = null) {
    fun showContactInformation() {
        println(
            "Имя: $name\n" +
                    "Номер: ${number ?: ""}\n" +
                    "Компания: ${company ?: "не указано"}"
        )
    }
}

fun main() {

    val contactList = mutableListOf<Contact4>()

    var isInProcess = true

    do {
        print("Введите имя контакта: ")
        val nameInput = readln()
        print("Введите номер контакта: ")
        val numberInput = readln().toLongOrNull()
        print("Введите название компании: ")
        var companyInput = readlnOrNull()
        if (companyInput?.trim() == "") companyInput = null
        if (numberInput == null) {
            println("Вы не ввели номер телефона, графа номера останется пустой")
            contactList.add(
                Contact4(
                    name = nameInput,
                    company = companyInput
                )
            )
        } else {
            contactList.add(
                Contact4(
                    name = nameInput,
                    number = numberInput,
                    company = companyInput
                )
            )
        }
        print("Желаете добавить еще контакт?\nВведите \'Да\' или нажмите \'Enter\' что бы выйти: ")
        val processFateInput = readln()
        if (processFateInput.lowercase() != "да") isInProcess = false
    } while (isInProcess)

    contactList.forEach {
        it.showContactInformation()
    }

}
package org.example.lesson_13

class Contact4(val name: String, val number: Long?, val company: String? = null) {
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
        if (numberInput == null) println("Вы не ввели номер, графа номера останется пустой")
        print("Введите название компании: ")
        var companyInput = readlnOrNull()
        if (companyInput?.trim() == "") companyInput = null
        contactList.add(
            Contact4(
            name = nameInput,
            number = numberInput,
            company = companyInput
        )
        )
        print("Желаете добавить еще контакт?\nВведите \'Да\' или нажмите \'Enter\' что бы выйти: ")
        val processFateInput = readln()
        if (processFateInput.lowercase() != "да") isInProcess = false
    } while (isInProcess)

    contactList.forEach {
        it.showContactInformation()
    }

}
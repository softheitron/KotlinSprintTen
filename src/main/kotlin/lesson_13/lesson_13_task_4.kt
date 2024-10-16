package org.example.lesson_13

class Contact4(val name: String, val number: Long, val company: String? = null) {
    fun showContactInformation() {
        println(
            "Имя: $name\n" +
                    "Номер: ${number}\n" +
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
        if (numberInput == null) {
            print(
                "Вы не ввели номер телефона, такой контакт не будет добавлен\n" +
                        "Начать заново или закрыть программу?\nДа/Нет? : "
            )
            val processFateInput = readln()
            if (processFateInput.lowercase().trim() == "да") {
                continue
            } else {
                println("До свидания!\n(все что вы успели занести в книгу отобразится ниже)")
                isInProcess = false
                continue
            }
        }
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
        if (processFateInput.lowercase().trim() != "да") isInProcess = false
    } while (isInProcess)

    println(
        "Занесенные в книгу контакты:\n" +
                "---------------------"
    )
    contactList.forEach {
        it.showContactInformation()
        println("---------------------")
    }

}
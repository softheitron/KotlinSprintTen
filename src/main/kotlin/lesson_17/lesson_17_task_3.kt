package org.example.lesson_17

class Folder(name: String, filesAmount: Int, private val isSecret: Boolean) {

    private var name = name
        get() = if (isSecret) "Secret Folder" else field

    private var filesAmount = filesAmount
        get() = if (isSecret) 0 else field

    fun readFolderData() {
        println(
            "Название папки: $name\n" +
                    "Файлов в папке: $filesAmount"
        )
    }
}

fun main() {

    val folder = Folder("Some Folder", 16, true)

    folder.readFolderData()

}
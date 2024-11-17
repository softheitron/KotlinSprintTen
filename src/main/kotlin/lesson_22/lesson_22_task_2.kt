package org.example.lesson_22

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {

    val book = RegularBook1("BookName", "AuthorName")
    val book2 = DataBook1("BookName", "AuthorName")

    println(book) // Вывод стандартного строкового значения для объекта, в целом это выглядит как ссылка на конкретный объект с путем где он находится
    println(book2)// Вывод с удобной реализацией дата класса по умолчанию
                  // (даже IDEA подсвечивает, что данные дата класса уже где то "используются", возможно в переопределенном toString())

}
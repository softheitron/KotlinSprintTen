package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {

    val book1 = RegularBook("King", "Author")
    val book2 = RegularBook("King", "Author")
    val book3 = DataBook("King", "Author")
    val book4 = DataBook("King", "Author")

    println(book1 == book2) //false потому что сравниваются ссылки на по сути разные объекты, хоть и содержимое одинаково
    println(book3 == book4) //true потому что происходит сравнение по значению свойств а не ссылок

}
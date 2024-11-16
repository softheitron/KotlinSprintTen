package org.example.lesson_19

enum class Category() {
    CLOTH,
    STATIONARY,
    OTHER;

    fun setCategory(): String {
        return when (this) {
            CLOTH -> "Одежда"
            STATIONARY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
    }
}

class Product(
    private val id: Int,
    val name: String,
    private val category: Category,
) {
    fun showProductInformation() {
        println(
            "Номер товара: $id\n" +
            "Имя товара: $name\n" +
            "Категория: ${category.setCategory()}")
    }
}

fun main() {

    val product1 = Product(1, "name", Category.CLOTH)
    val product2 = Product(2, "something", Category.OTHER)
    val product3 = Product(3, "pencil", Category.STATIONARY)

    product1.showProductInformation()
    product2.showProductInformation()
    product3.showProductInformation()

}

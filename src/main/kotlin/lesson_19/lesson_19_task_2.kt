package org.example.lesson_19

enum class Category() {
    CLOTH {
        override fun showProductInformation(): String {
            return "Одежда"
        }
    },
    STATIONARY {
        override fun showProductInformation(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun showProductInformation(): String {
            return "Разное"
        }
    },
    ERROR {
        override fun showProductInformation(): String {
            return "Несуществующая категория"
        }
    };

    abstract fun showProductInformation(): String
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
            "Категория: ${setCategory(category)}"
        )
    }
}

fun setCategory(category: Category): String {
    return when (category) {
        Category.CLOTH -> category.showProductInformation()
        Category.STATIONARY -> category.showProductInformation()
        Category.OTHER -> category.showProductInformation()
        Category.ERROR -> category.showProductInformation()
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

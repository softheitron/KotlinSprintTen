package org.example.lesson_18

open class OrderItem {

    open fun getOrderInformation() = ""

}

class SingleItem(
    private val orderNumber: String,
    private val product: String,
): OrderItem() {
    override fun getOrderInformation(): String {
        return "Заказан товар: $product"
    }
}

class ListItem(
    private val orderNumber: String,
    private val product: List<String>,
): OrderItem() {
    override fun getOrderInformation(): String {
        return "Заказаны следующие товары: ${product.joinToString() }"
    }
}

fun main() {

    val order1 = SingleItem(
        "13213111",
        "some product"
    )

    val order2 = ListItem(
        "1556657",
        listOf("prod1", "prod2", "prod3")
    )

    println(order1.getOrderInformation())
    println()
    println(order2.getOrderInformation())

}
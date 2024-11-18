package org.example.lesson_18

class OrderItem(val orderNumber: String) {

    fun getOrderInformation(product: String) {
        println("Номер заказа: $orderNumber\n" +
                "Наименование товара: $product")
    }

    fun getOrderInformation(products: List<String>) {
        println("Номер заказа: $orderNumber\n" +
                "Наименование товарoв: ${products.joinToString()}")
    }

}



fun main() {

    val order1 = OrderItem(
        "13213111"
    )

    val order2 = OrderItem(
        "1556657"
    )

    println(order1.getOrderInformation("SingleProduct"))
    println()
    println(order2.getOrderInformation(listOf("multiple", "products", "test")))

}
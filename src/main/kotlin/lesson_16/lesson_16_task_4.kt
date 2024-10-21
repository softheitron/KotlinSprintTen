package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var orderStatus: String = "Ожидает принятия",
) {

    fun printOrderInformation() {
        println("Номер заказа: $orderNumber\n" +
                "Статус: $orderStatus")
    }

    fun changeOrderRequest(newStatus: String) {
        println("Заявка отправлена")
        changeOrderStatus(newStatus)
    }

    private fun changeOrderStatus(newStatus: String) {
        orderStatus = newStatus
    }

}

fun main() {

    val order = Order(1)

    order.printOrderInformation()
    order.changeOrderRequest("Принято")
    order.printOrderInformation()

}
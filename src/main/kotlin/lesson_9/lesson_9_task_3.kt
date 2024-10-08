package org.example.lesson_9

fun main() {

    val onePortionList = listOf(2, 50, 15)

    print("Укажите желаемое количество порций: ")
    val portionAmountInput = readln().toInt()

    val selectedPortionsAmountList = onePortionList.map {
        it * portionAmountInput
    }

    val portionAmountString =
        "Яиц - %d, молока - %dмл, сливочного масла %dгр"
            .format(
                selectedPortionsAmountList[0],
                selectedPortionsAmountList[1],
                selectedPortionsAmountList[2]
            )

    print("На $portionAmountInput порций вам понадобится: $portionAmountString")

}
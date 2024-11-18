package org.example.lesson_22

class MainScreenViewModel() {
    private var mainScreenState = MainScreenState()

    data class MainScreenState(val data: String = "данных нет", val isLoading: Boolean = false)

    fun loadData() {
        println(mainScreenState.data)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Начало загрузки данных - ${mainScreenState.isLoading}")
        println("Данные загружаются")
        Thread.sleep(2000)
        mainScreenState = mainScreenState.copy(data = "\"Загруженные данные\"", isLoading = false)
        println("Данные загрузились: ${mainScreenState.data}")
    }
}

fun main() {

    val mainScreen = MainScreenViewModel()

    mainScreen.loadData()

}
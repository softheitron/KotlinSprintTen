package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {

    print("Введите желаемое количество символов в пароле(минимум 6 символов): ")
    val passLengthInput = readln().toInt()

    if (passLengthInput < MIN_PASSWORD_LENGTH) {
        print("Символов должно быть не менее 6!\nПерезапустите программу.")
        return
    }

    val charAlphabet = 'a'..'z'
    val naturalCharNumbers = '1'..'9'
    val upperCharAlphabet = 'A'..'Z'
    val requiredSymbols = listOf(
        charAlphabet.random(),
        naturalCharNumbers.random(),
        upperCharAlphabet.random())
    val allSymbolsList = charAlphabet + naturalCharNumbers + upperCharAlphabet

    val generatedPasswordArray = mutableListOf<Char>()
    generatedPasswordArray.addAll(requiredSymbols)

    for (i in 1..(passLengthInput - requiredSymbols.size)) {
        generatedPasswordArray.add(allSymbolsList.random())
    }

    generatedPasswordArray.shuffled().forEach {
        print(it)
    }

}

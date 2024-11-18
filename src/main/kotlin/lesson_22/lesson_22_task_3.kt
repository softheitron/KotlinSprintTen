package org.example.lesson_22

data class Destructuring(
    val field1: Int,
    val field2: String,
    val field3: String,
)

fun main() {

    val dest = Destructuring(
        12,
        "Mandero",
        "Gooro"
    )

    val (f1, f2, f3) = dest //Или fN = dest.componentN() 1..N times

    println("f1 is $f1, f2 is $f2, f3 is $f3")

}
package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val employeeSalary = 30000
    val numberOfTrainees = 30
    val traineeSalary = 20000
    val numberOfAllWorkers = numberOfTrainees + numberOfEmployees

    val employeeSalaryConsumption = numberOfEmployees * employeeSalary
    val traineeSalaryConsumption = numberOfTrainees * traineeSalary
    val overallConsumption = employeeSalaryConsumption + traineeSalaryConsumption

    val meanSalary = overallConsumption / numberOfAllWorkers

    println(employeeSalaryConsumption)
    println(overallConsumption)
    println(meanSalary)

}
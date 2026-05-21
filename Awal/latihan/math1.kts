#!/usr/bin/env kotlin

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Fungsi add() yang benar
fun add(firstNum: Int, secondNum: Int): Int {
    return firstNum + secondNum
}

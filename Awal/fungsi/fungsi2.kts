#!/usr/bin/env kotlin

fun main() {
    val greeting = birtdayGreeting()
    println(greeting)
}

fun birtdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
#!/usr/bin/env kotlin

fun main() {
    println(birtdayGreeting("Rover"))
    println(birtdayGreeting("Rex"))
}

fun birtdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
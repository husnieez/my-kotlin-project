#!/usr/bin/env kotlin

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(App: String, id: String): String {
    return "There's a new sign-in request on $App for your Google Account $id."
}
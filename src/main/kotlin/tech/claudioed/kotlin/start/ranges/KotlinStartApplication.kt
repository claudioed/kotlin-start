package tech.claudioed.kotlin.start.ranges

import tech.claudioed.kotlin.start.data.Person

class KotlinStartApplication

fun main(args: Array<String>) {

    println("\n")
    println("========")

    for (i in 1..100) { print(i) }

    println("\n")
    println("========")

    for (i in 1 until 100) { print(i) }

    println("\n")
    println("========")

    for (x in 2..10 step 2) { print(x) }

    println("\n")
    println("========")

    for (x in 10 downTo 1) { print(x) }

    println("\n")
    println("========")

}

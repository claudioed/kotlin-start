package tech.claudioed.kotlin.start.filter

class KotlinStartApplication

fun main(args: Array<String>) {

    val numbers = listOf(3, 5, 7, -1, -100)

    println(numbers)

    println(numbers.filter { it > 0 })

}


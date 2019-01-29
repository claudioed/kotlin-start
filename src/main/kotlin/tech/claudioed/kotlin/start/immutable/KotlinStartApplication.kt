package tech.claudioed.kotlin.start.immutable

import tech.claudioed.kotlin.start.data.Person

class KotlinStartApplication

fun main(args: Array<String>) {

    println(listOf("a", "b", "c"))

    val letters = mapOf("a" to 1, "b" to 2, "c" to 3)

    println(letters)

    print("value for A ${letters["a"]}")

}

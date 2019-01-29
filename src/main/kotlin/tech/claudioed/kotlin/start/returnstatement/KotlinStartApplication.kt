package tech.claudioed.kotlin.start.returnstatement

import tech.claudioed.kotlin.start.data.Person

class KotlinStartApplication

fun main(args: Array<String>) {

    println(ColorConverter().transform("Red"))
    println(ColorConverter().transform("Green"))
    println(ColorConverter().transform("Blue"))

}

class ColorConverter {

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }
}
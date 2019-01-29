package tech.claudioed.kotlin.start.function

class KotlinStartApplication

fun main(args: Array<String>) {

    val printer = Printer()
    printer.hello()
    printer.hello("Oi","golang")

}

class Printer{

    fun hello(greeting: String = "Oi", language: String = "java") {
        println("$greeting $language")
    }

}

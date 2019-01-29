package tech.claudioed.kotlin.start.interpolation

import tech.claudioed.kotlin.start.data.Person

class KotlinStartApplication

fun main(args: Array<String>) {

    val name = "Java"
    println("Name $name")

    val person = Person(name="John Doe",email = "joe@doe.com")

    val person2 = person.copy(email = "joe2@doe.com")

    // (Java) Cloneable sucks

    println("Person ${person.name} ${person.email}")

    println("Person ${person2.name} ${person2.email}")

}

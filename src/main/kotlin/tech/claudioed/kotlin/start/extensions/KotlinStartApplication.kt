package tech.claudioed.kotlin.start.extensions

class KotlinStartApplication

fun main(args: Array<String>) {

    val p = Printer()

    //"".join() Here is NOT Possible because the context

    println(p.print("Data Element for example"))

}


class Printer{

    fun print(value: String):String{
        return value.join()
    }


    fun String.join() :String{
        return this.replace(" ","",false)

    }

}

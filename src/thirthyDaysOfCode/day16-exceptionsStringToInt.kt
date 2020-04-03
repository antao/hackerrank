package thirthyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.next()
    scanner.close()

    try {
        val num = value.toInt()
        println(num)
    } catch (e: NumberFormatException) {
        // Do something with your number format exception
        println("Bad String")
    }
}
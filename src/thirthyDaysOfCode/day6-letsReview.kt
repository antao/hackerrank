package thirthyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val T = scan.nextInt()
    for (i in 0 until T) {
        val currentValue = scan.next()
        printEvensAndOdds(currentValue)
    }
    scan.close()
}

fun printEvensAndOdds(currentValue: String) {
    val evens = StringBuffer()
    val odds = StringBuffer()
    for (i in 0 until currentValue.length) {
        val char = currentValue[i]
        when {
            i % 2 == 0 -> evens.append(char)
            else -> odds.append(char)
        }
    }
    println("$evens $odds")
}
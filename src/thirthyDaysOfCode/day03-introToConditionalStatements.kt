package thirthyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    scan.close()
    var result = ""

    when {
        n % 2 == 1 -> result = "Weird"
        n >= 6 && n <= 20 -> println("Weird")
        else -> println("Not Weird")
    }
    println(result)
}

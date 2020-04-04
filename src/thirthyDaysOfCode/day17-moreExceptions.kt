package thirthyDaysOfCode

import java.util.*
import kotlin.math.pow

internal class Calculator {
    @Throws(Exception::class)
    fun power(n: Int, p: Int): Int {
        return if (n < 0 || p < 0) {
            throw Exception("n and p should be non-negative")
        } else {
            n.toDouble().pow(p.toDouble()).toInt()
        }
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var t = scanner.nextInt()
    while (t-- > 0) {
        val n = scanner.nextInt()
        val p = scanner.nextInt()
        val myCalculator = Calculator()
        try {
            val ans = myCalculator.power(n, p)
            println(ans)
        } catch (e: Exception) {
            println(e.message)
        }
    }
    scanner.close()
}

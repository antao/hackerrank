package thirthyDaysOfCode

import java.util.*
import kotlin.math.sqrt

internal interface AdvancedArithmetic {
    fun divisorSum(n: Int): Int
}

private class CalculatorDay19 : AdvancedArithmetic {
    override fun divisorSum(n: Int): Int {
        var result = 0
        val sqrt = sqrt(n.toDouble()).toInt()

        val step = if (n % 2 == 1) 2 else 1
        var i = 1
        while (i <= sqrt) {
            if (n % i == 0) {
                result += i + n / i
            }
            i += step
        }

        if (sqrt * sqrt == n) {
            result -= sqrt
        }

        return result
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n: Int = scan.nextInt()
    scan.close()
    val myCalculator: AdvancedArithmetic = CalculatorDay19()
    val sum: Int = myCalculator.divisorSum(n)
    println("""I implemented: ${myCalculator.javaClass.interfaces[0].name}""")
    println(sum)
}
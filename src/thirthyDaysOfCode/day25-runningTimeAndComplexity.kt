package thirthyDaysOfCode

import java.util.*
import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    when {
        n < 2 -> {
            return false
        }
        n == 2 -> {
            return true
        }
        n % 2 == 0 -> {
            return false
        }
        else -> {
            val sqrt = sqrt(n.toDouble()).toInt()
            var i = 3
            while (i <= sqrt) {
                if (n % i == 0) {
                    return false
                }
                i += 2
            }
            return true
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var T: Int = scan.nextInt()
    while (T-- > 0) {
        val n: Int = scan.nextInt()
        println(if (isPrime(n)) "Prime" else "Not prime")
    }
    scan.close()
}
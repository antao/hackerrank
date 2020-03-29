package thirthyDaysOfCode

import java.util.*

fun convertDecimalToBinary(decimalNumber: Int, binaryString: String = ""): String {
    while (decimalNumber > 0) {
        val temp = "${binaryString}${decimalNumber % 2}"
        return convertDecimalToBinary(decimalNumber / 2, temp)
    }
    return binaryString.reversed()
}

fun consecutiveOnes(binaryNumber: String): Int {
    var max = 0
    var consecutiveOne = 0
    for (element in binaryNumber) {
        if (element == '1') {
            consecutiveOne++
            max = max.coerceAtLeast(consecutiveOne)
        } else {
            consecutiveOne = 0
        }
    }
    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    println(consecutiveOnes(convertDecimalToBinary(n)))
    // println(consecutiveOnes(Integer.toBinaryString(n)))
}

package thirthyDaysOfCode

import java.util.*
import java.util.Arrays.stream

internal class Difference(private val elements: IntArray) {
    var maximumDifference = 0

    fun computeDifference() {
        val max = stream(elements).max().asInt
        val min = stream(elements).min().asInt
        maximumDifference = max - min
    }
}

fun main() {
    val difference = Difference(intArrayOf(1, 2, 5))
    difference.computeDifference()
    print(difference.maximumDifference)
}
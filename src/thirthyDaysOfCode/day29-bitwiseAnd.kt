package thirthyDaysOfCode

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")
        val N = nk[0].trim().toInt()
        val K = nk[1].trim().toInt()

        var result = 0
        for (j in 1 until N) {
            for (k in j + 1..N) {
                val h: Int = j and k
                if (h < K && result < h) result = h
            }
        }
        println(result)
    }
}

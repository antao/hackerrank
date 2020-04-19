package thirthyDaysOfCode

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.regex.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun main(args: Array<String?>?) {
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    val emailRegex = ".+@gmail\\.com$"
    val pattern: Pattern = Pattern.compile(emailRegex)

    val result: ArrayList<String> = ArrayList()
    (0 until N).forEach { i ->
        val name: String = scanner.next()
        val email: String = scanner.next()
        val matcher: Matcher = pattern.matcher(email)
        if (matcher.find()) result.add(name)
    }

    Collections.sort(result)
    result.forEach(System.out::println)
}

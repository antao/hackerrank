package thirthyDaysOfCode

import java.time.LocalDate
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val returnDate = readDate(scan)
    val expectDate = readDate(scan)
    scan.close()

    val result: Int
    result = when {
        returnDate.isEqual(expectDate) || returnDate.isBefore(expectDate) -> {
            0
        }
        returnDate.month == expectDate.month && returnDate.year == expectDate.year -> {
            15 * (returnDate.dayOfMonth - expectDate.dayOfMonth)
        }
        returnDate.year == expectDate.year -> {
            500 * (returnDate.monthValue - expectDate.monthValue)
        }
        else -> {
            10000
        }
    }
    println(result)
}

fun readDate(scan: Scanner): LocalDate {
    val day = scan.nextInt()
    val month = scan.nextInt()
    val year = scan.nextInt()
    return LocalDate.of(year, month, day)
}
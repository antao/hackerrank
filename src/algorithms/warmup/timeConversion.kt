package algorithms.warmup

fun main() {
    println(timeConversion("07:05:45PM"))
}

private fun timeConversion(s: String): String {
    val clockSystem = s.substring(8)
    val hours = s.substring(0, 2)
    val remainingTime = s.substring(2, 8)

    return when {
        clockSystem == "AM" && hours == "12" -> "00$remainingTime"
        clockSystem == "PM" && hours != "12" -> "${12 + hours.toInt()}$remainingTime"
        else -> (hours + remainingTime)
    }
}
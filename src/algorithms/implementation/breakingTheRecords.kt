import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var mostPoints = scores[0]
    var leastPoints = scores[0]
    var mostPointsBreak = 0
    var leastPointsBreak = 0

    for (i in 1 until scores.size) {
        val points = scores[i]
        if (points > mostPoints) {
            mostPoints = points
            mostPointsBreak += 1
        }
        if (points < leastPoints) {
            leastPoints = points
            leastPointsBreak += 1
        }
    }

    return arrayOf(mostPointsBreak, leastPointsBreak)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}

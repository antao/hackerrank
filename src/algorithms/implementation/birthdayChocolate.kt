package algorithms.implementation

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var result = 0
    var sum = (0 until m).sumBy { s[it] }

    if (sum == d)
        result++

    (m until s.size).forEach { i ->
        sum += s[i] - s[i - m]
        if (sum == d)
            result++
    }

    return result
}

fun main(args: Array<String>) {
    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}

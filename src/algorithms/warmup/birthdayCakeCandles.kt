package algorithms.warmup

fun main() {
    println(birthdayCakeCandles(arrayOf(3, 2, 1, 3)))
}

private fun birthdayCakeCandles(ar: Array<Int>): Int {
    var max: Int = ar[0]
    var result: Int = 1

    for (x in 1 until ar.size) {
        if (ar[x] == max) {
            result++
            continue
        }
        if (ar[x] > max) {
            max = ar[x]
            result = 1
        }
    }

    return result
}
package algorithms.warmup

fun main() {
    miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
}

private fun miniMaxSum(arr: Array<Long>): Unit {
    arr.sort() // I feel like cheating here, but sort() is available
    println("${arr.take(arr.size - 1).sum()} ${arr.drop(1).sum()}")
}

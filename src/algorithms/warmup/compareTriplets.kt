package algorithms.warmup

fun main() {
    val result: Array<Int> = compareTriplets(arrayOf(17, 28, 30), arrayOf(99, 16, 8))
    println(result.joinToString(" "))
}

private fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alicePoints = 0
    var bobPoints = 0

    for (x in 0..2) {
        val itemAlice = a[x]
        val itemBob = b[x]
        if (itemAlice > itemBob)
            alicePoints++

        if (itemBob > itemAlice)
            bobPoints++
    }

    return arrayOf(alicePoints, bobPoints)
}
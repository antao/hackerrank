package warmup.plusMinus

fun main() {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

private fun plusMinus(arr: Array<Int>) {
    var positiveNumbers = 0
    var negativeNumbers = 0
    var zeroNumbers = 0

    arr.forEach {
        when {
            it > 0 -> {
                ++positiveNumbers
            }
            it < 0 -> {
                ++ negativeNumbers
            }
            else -> {
                ++zeroNumbers
            }
        }
    }
    println(message = positiveNumbers.toFloat()/ arr.size)
    println(message = negativeNumbers.toFloat()/ arr.size)
    println(message = zeroNumbers.toFloat()/ arr.size)
}
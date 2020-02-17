package warmup.plusMinus

fun main(args: Array<String>) {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(arr)
}

private fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0;
    var negativeNumbers = 0;
    var zeroNumbers = 0;
    var total = arr.size

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
    println(positiveNumbers.toFloat()/total)
    println(negativeNumbers.toFloat()/total)
    println(zeroNumbers.toFloat()/total)
}
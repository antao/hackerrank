package algorithms.warmup

fun main() {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

private fun plusMinus(arr: Array<Int>) {
    println(message = arr.filter { x -> x > 0 }.size.toFloat() / arr.size)
    println(message = arr.filter { x -> x < 0}.size.toFloat() / arr.size)
    println(message = arr.filter { x -> x == 0}.size.toFloat() / arr.size)

}
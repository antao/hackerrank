package thirthyDaysOfCode

// Further read at https://kotlinlang.org/docs/reference/generics.html

fun <T> printArray(array: Array<T>) {
    for (item in array) {
        println(item)
    }
}

/* Star projections */
fun printArrayStarProjections(array: Array<*>) {
    array.forEach { println(it) }
}

fun main() {
    printArray(arrayOf(1, 2, 3))
    printArray(arrayOf("these", "pretzels", "are", "making", "me", "thirsty"))
}
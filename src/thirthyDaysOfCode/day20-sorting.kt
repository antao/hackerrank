package thirthyDaysOfCode

import java.util.*

class SortingSolution {
    private var swaps = 0

    private fun bubbleSort(array: IntArray) {
        var swapped = true
        var offset = 0
        while (swapped) {
            swapped = false
            for (i in 1 until array.size - offset) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i)
                    swapped = true
                }
            }
            offset++
        }
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
        swaps++
    }

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val n: Int = scanner.nextInt()
        val a = IntArray(n)
        for (a_i in 0 until n) {
            a[a_i] = scanner.nextInt()
        }

        // Write Your Code Here
        scanner.close()
        bubbleSort(a)
        println("Array is sorted in $swaps swaps.")
        println("First Element: " + a[0])
        println("Last Element: " + a[a.size - 1])
    }
}
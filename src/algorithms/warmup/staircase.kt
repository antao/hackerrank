package warmup.staircase

fun main() {
    staircase(3)
}

private fun staircase(n: Int) {
    for (x in 1..n) {
        println(" ".repeat(n-x) + "#".repeat(x))
    }
}
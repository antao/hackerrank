import java.util.*
import kotlin.collections.*

// Complete the sockMerchant function below.
fun sockMerchant(ar: Array<Int>): Int {
    var pairsFound = 0
    var sockColorHash: HashMap<Int, Int> = hashMapOf<Int, Int>()

    ar.forEach {
        if (sockColorHash.containsKey(it)) {
            pairsFound++
            sockColorHash.remove(it)
        } else {
            sockColorHash[it] = 1
        }
    }
    return pairsFound
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(ar)

    println(result)
}

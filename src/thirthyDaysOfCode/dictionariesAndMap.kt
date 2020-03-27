package thirthyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val total = scan.nextLine().trim().toInt()

    var phoneNumbers: HashMap<String, Int> = hashMapOf<String, Int>()

    for (x in 1..total) {
        var details = scan.nextLine().trim().split(" ")
        phoneNumbers[details[0]] = details[1].toInt()
    }

    for (x in 1..total) {
        var key = scan.nextLine().trim()
        if (phoneNumbers.containsKey(key)) {
            println(key + "=" + phoneNumbers.getValue(key))
        } else {
            println("Not found")
        }
    }
}
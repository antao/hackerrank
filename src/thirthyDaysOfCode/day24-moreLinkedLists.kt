package thirthyDaysOfCode

import java.util.*

class NodeDay24(var data: Int) {
    var next: NodeDay24? = null
}

fun removeDuplicates(head: NodeDay24?): NodeDay24? {
    if (head == null) {
        return null
    }
    var n: NodeDay24? = head
    while (n!!.next != null) {
        if (n.data == n.next!!.data) {
            n.next = n.next!!.next
        } else {
            n = n.next
        }
    }
    return head
}

fun insert(head: NodeDay24?, data: Int): NodeDay24? {
    var head = head
    val p = NodeDay24(data)
    if (head == null) head = p else if (head.next == null) head.next = p else {
        var start = head
        while (start!!.next != null) start = start.next
        start.next = p
    }
    return head
}

fun display(head: NodeDay24?) {
    var start = head
    while (start != null) {
        println(start.data.toString() + " ")
        start = start.next
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var head: NodeDay24? = null
    var T: Int = sc.nextInt()
    while (T-- > 0) {
        val ele: Int = sc.nextInt()
        head = insert(head, ele)
    }
    head = removeDuplicates(head)
    display(head)
}
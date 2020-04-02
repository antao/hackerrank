package thirthyDaysOfCode

import java.util.*

class Node(var data: Int) {
    var next: Node? = null
}

fun insert(head: Node?, data: Int): Node? {
    return if (head == null) {
        Node(data)
    } else {
        var n = head
        while (n!!.next != null) {
            n = n.next
        }
        n.next = Node(data)
        head
    }
}

fun display(head: Node?) {
    var start = head
    while (start != null) {
        print(start.data.toString() + " ")
        start = start.next
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var head: Node? = null
    var N: Int = sc.nextInt()
    while (N-- > 0) {
        val ele: Int = sc.nextInt()
        head = insert(head, ele)
    }
    display(head)
    sc.close()
}
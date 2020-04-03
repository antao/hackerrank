package thirthyDaysOfCode

import java.util.*
import kotlin.math.max

class NodeBst(var data: Int) {
    var left: NodeBst?
    var right: NodeBst? = null

    init {
        left = right
    }
}

fun getHeight(root: NodeBst?): Int {
    return if (root == null) {
        -1
    } else {
        1 + max(getHeight(root.left), getHeight(root.right))
    }
}

fun insertBst(root: NodeBst?, data: Int): NodeBst {
    return if (root == null) {
        NodeBst(data)
    } else {
        val current: NodeBst
        if (data <= root.data) {
            current = insertBst(root.left, data)
            root.left = current
        } else {
            current = insertBst(root.right, data)
            root.right = current
        }
        root
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var t: Int = sc.nextInt()
    var root: NodeBst? = null
    while (t-- > 0) {
        val data: Int = sc.nextInt()
        root = insertBst(root, data)
    }
    val height: Int = getHeight(root)
    println(height)
}
package thirthyDaysOfCode

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

internal class NodeDay23(var data: Int) {
    var left: NodeDay23?
    var right: NodeDay23? = null

    init {
        left = right
    }
}

fun levelOrder(root: NodeDay23?) {
    when (root) {
        null -> println("nothing to display")
    }
    val q: Queue<NodeDay23> = LinkedList<NodeDay23>()
    q.add(root)
    while (!q.isEmpty()) {
        val node: NodeDay23 = q.poll() as NodeDay23
        print(node.data.toString() + " ")
        if (node.left != null) q.add(node.left)
        if (node.right != null) q.add(node.right)
    }
}

fun insert(root: NodeDay23, data: Int): NodeDay23 {
    return if (root == null) {
        NodeDay23(data)
    } else {
        val cur: NodeDay23
        if (data <= root.data) {
            cur = insert(root.left, data)
            root.left = cur
        } else {
            cur = insert(root.right, data)
            root.right = cur
        }
        root
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(java.lang.System.`in`)
    var T: Int = sc.nextInt()
    var root: Node? = null
    while (T-- > 0) {
        val data: Int = sc.nextInt()
        root = insert(root, data)
    }
    sc.close()
    levelOrder(root)
}
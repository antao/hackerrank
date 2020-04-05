package thirthyDaysOfCode

import java.util.*

class SolutionQueuesAndStacks {

    private var dequeAsStack: ArrayDeque<Char> = ArrayDeque()

    fun pushCharacter(char: Char) {
        dequeAsStack.push(char)
    }

    fun popCharacter(): Char {
        return dequeAsStack.pop()
    }

    private var dequeAsQueue: ArrayDeque<Char> = ArrayDeque()

    fun enqueueCharacter(char: Char) {
        dequeAsQueue.add(char)
    }

    fun dequeueCharacter(): Char {
        return dequeAsQueue.remove()
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input: String = scanner.nextLine()
    scanner.close()

    // Convert input String to an array of characters:
    val s = input.toCharArray()

    // Create a Solution object:
    val p = SolutionQueuesAndStacks()

    // Enqueue/Push all chars to their respective data structures:
    for (c in s) {
        p.pushCharacter(c)
        p.enqueueCharacter(c)
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    var isPalindrome = true
    for (i in 0 until s.size / 2) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false
            break
        }
    }

    //Finally, print whether string s is palindrome or not.
    println("The word, " + input + ", is " + if (!isPalindrome) "not a palindrome." else "a palindrome.")
}
package thirthyDaysOfCode

import java.util.*

internal open class Person
(private var firstName: String, private var lastName: String, private var idNumber: Int) {
    fun printPerson() = println("Name: $lastName, $firstName\nID: $idNumber")
}

internal class Student
(firstName: String?, lastName: String?, identification: Int, private val testScores: IntArray) : Person(firstName!!, lastName!!, identification) {

    fun calculate(): Char {
        var average = 0.0
        for (score in testScores) {
            average += score.toDouble()
        }

        average /= testScores.size.toDouble()
        return when {
            average >= 90 -> 'O'
            average >= 80 -> 'E'
            average >= 70 -> 'A'
            average >= 55 -> 'P'
            average >= 40 -> 'D'
            else -> 'T'
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val firstName = scan.next()
    val lastName = scan.next()
    val id = scan.nextInt()
    val numScores = scan.nextInt()
    val testScores = IntArray(numScores)
    for (i in 0 until numScores) {
        testScores[i] = scan.nextInt()
    }
    scan.close()

    val s = Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: " + s.calculate())
}

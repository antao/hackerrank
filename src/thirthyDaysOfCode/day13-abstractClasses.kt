package thirthyDaysOfCode

internal abstract class Book(var title: String, var author: String) {
    abstract fun display()

}

internal class MyBook(title: String?, author: String?, var price: Int) : Book(title!!, author!!) {
    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }
}

fun main() {
    val book: Book = MyBook("The Brothers Karamazov", "Dostoevsky", 42)
    book.display()
}

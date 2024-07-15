import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object q2 {
  var books: Set[Book] = Set(
    Book("Book1", "Amantha", "23"),
    Book("Book2", "Tharusha", "84"),
    Book("Book3", "Sanudi", "91")
  )

  def addBook(newbook: Book): Unit = {
    books += newbook
    println(s"Added: ${newbook.title}")
  }

  def removeBook(bookisbn: String): Unit = {
    val bookToRemove = books.find(_.isbn == bookisbn)
    bookToRemove match {
      case Some(book) =>
        books -= book
        println(s"Removed: ${book.title}")
      case None =>
        println(s"Book with ISBN: $bookisbn does not exist.")
    }
  }

  def isAvailable(isbn: String): Boolean = {
    books.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    if (books.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current library: ")
      books.foreach { book =>
        println(
          s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"
        )
      }
    }
  }

  def searchByTitle(title: String): Unit = {
    val foundBooks =
      books.filter(_.title.toLowerCase.contains(title.toLowerCase))
    if (foundBooks.isEmpty) {
      println(s"No books found with title: $title")
    } else {
      println("Books found:")
      foundBooks.foreach { book =>
        println(
          s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"
        )
      }
    }
  }

  def displayByAuthor(author: String): Unit = {
    val booksByAuthor = books.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.isEmpty) {
      println(s"Books by author: $author does not exist in the library.")
    } else {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(
          s"Title: ${book.title}, ISBN: ${book.isbn}"
        )
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var running = true

    while (running) {
      println("\nLibrary Management System")
      println("1. Display library collection")
      println("2. Add a new book")
      println("3. Remove a book by ISBN")
      println("4. Check book availability")
      println("5. Search for book by title")
      println("6. Display books by author")
      println("7. Exit\n")
      print("Choose as option: ")

      readLine() match {
        case "1" => displayLibrary()
        case "2" =>
          print("Enter book title: ")
          val title = readLine()
          print("Enter author: ")
          val author = readLine()
          print("Enter book ISBN: ")
          val isbn = readLine()
          addBook(Book(title, author, isbn))
        case "3" =>
          print("Enter ISBN of the book to remove: ")
          val isbn = readLine()
          removeBook(isbn)
        case "4" =>
          print("Enter book ISBN to check availability: ")
          val isbn = readLine()
          if (isAvailable(isbn)) {
            println("Book is available")
          } else {
            println("Books is not available")
          }
        case "5" =>
          print("Enter title to search for book: ")
          val title = readLine()
          searchByTitle(title)
        case "6" =>
          print("Enter author to search for books: ")
          val author = readLine()
          displayByAuthor(author)
        case "7" =>
          running = false
          println("Exiting LMS. Bye..")
        case _ =>
          println("Invalid option. Please try again.")
      }
    }
  }
}

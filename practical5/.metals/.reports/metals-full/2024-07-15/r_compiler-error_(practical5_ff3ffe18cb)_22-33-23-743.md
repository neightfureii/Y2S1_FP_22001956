file:///D:/UCSC/2Yr%201Sem/FP/practical5/q2.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Program%20Files/Java/jdk-22/lib/src.zip!/java.base/java/lang/String.java

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 2484
uri: file:///D:/UCSC/2Yr%201Sem/FP/practical5/q2.scala
text:
```scala
import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object q2 {
  var books: Set[Book] = Set(
    Book("Book1", "Amantha", "2309483048"),
    Book("Book2", "Tharusha", "84798137401"),
    Book("Book3", "Sanudi", "91348104934")
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

  def isAvailable(isbn: String): Unit = {
    books.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    if (books.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current library: ")
      books.foreach { book =>
        println(
          s"Title: ${books.title}, Author: ${books.author}, ISBN: ${books.isbn}"
        )
      }
    }
  }

  def searchByTitle(title: String): Unit = {
    val foundBooks = books.filter(_.title.toLowerCase.contains(title.toLowerCase))
    if(foundBooks.isEmpty) {
        println(s"No books found with title: $title")
    } else {
        println("Books found:")
        foundBooks.foreach{ book=>
            println(s"Title: ${books.title}, Author: ${books.author}, ISBN: ${books.isbn}")
        }
    }
  }

  def displayByAuthor(author: String): Unit = {
    val booksByAuthor = books.filter(_.author.toLowerCase == author.toLowerCase)
    if(booksByAuthor.isEmpty) {
        println(s"Books by author: $booksByAuthor does not exist in the library.")
    } else {
        println(s"Books by $author:")
        books.foreach{ book=>
            println(s"Title: ${books.title}, Author: ${books.author}, ISBN: ${books.isbn}")    
        }
    }
  }

  def main(args: Array[String]): Unit = {
    var running = true

    while(running) {
        println("\nLibrary Management System")
        println("1. Display library collection")
        println("2. Add a new book")
        println("3. Remove a book by ISBN")
        println("4. Check book availability")
        println("5. Search for book by title")
        println("6. Display books by author")
        println("7. Exit\n")
        print("Choose as option: ")

        readLine() m@@
    }
  }
}

```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:204)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:175)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:231)
	java.base/java.nio.file.Path.of(Path.java:148)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Program%20Files/Java/jdk-22/lib/src.zip!/java.base/java/lang/String.java
object q5 extends App {

  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)

    val totalLetters = wordLengths.reduce(_ + _)

    totalLetters
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(words)

  println(s"Total count of letter occurrences: $totalCount")
}
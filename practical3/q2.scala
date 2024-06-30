import scala.io.StdIn.readLine

object q2 {
  def readStrings(s: List[String] = List()): List[String] = {
    val input = readLine()
    if (input.isEmpty()) s
    else readStrings(s :+ input)
  }

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    println("Enter strings one by one(press enter twice to stop): ")

    val original = readStrings()
    val filtered = filterStrings(original)

    println(s"Original list: $original")
    println(s"List with strings of length more than 5: $filtered")
  }
}

import scala.io.StdIn.readLine

object q1 {
  def reverse(s: String): String = {
    if (s.isEmpty()) s
    else reverse(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    print("Enter a string to reverse: ")
    val original = readLine()
    val reversed = reverse(original)
    println(s"\nOriginal string: $original")
    println(s"Reversed string: $reversed")
  }
}

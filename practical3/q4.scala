import scala.io.StdIn.readLine

object q4 {
  def sumInt(total: Int): Int = {
    val input = readLine()
    if (input.isEmpty()) total
    else {
      val number = input.toInt
      if (number % 2 == 0) sumInt(total + number)
      else sumInt(total)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter integers one by one(press enter twice to stop): ")

    val result = sumInt(0)

    println(s"Sum of the even numbers: $result")
  }
}

import scala.io.StdIn.readLine

object q3 {
  def mean(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val num1 = readLine().toInt
    print("Enter another number: ")
    val num2 = readLine().toInt

    val result = mean(num1, num2)
    println(s"The arithmetic mean of $num1 and $num2 is: $result")
  }
}

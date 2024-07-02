import scala.io.StdIn.readInt

object q3 {
  def mean(num1: Int, num2: Int): Double = (num1 + num2) / 2.0

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val num1 = readInt()
    print("Enter another number: ")
    val num2 = readInt()

    val result = mean(num1, num2)
    printf("The arithmetic mean of %d and %d is: %.2f", num1, num2, result)
  }
}

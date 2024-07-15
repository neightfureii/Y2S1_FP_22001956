import scala.io.StdIn.readInt

object q3 {
  def fibo(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibo(n - 1) + fibo(n - 2)
  }

  def printFibo(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fibo(i))
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number of fibonacci values needed: ")
    val n = readInt()
    printFibo(n)
  }
}

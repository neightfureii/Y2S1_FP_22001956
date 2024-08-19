import scala.io.StdIn.readDouble

object InterestCalculator {
  def interest(depo: Double): Double = {
    val interestRate: Double => Double = {
      case x if x <= 20000   => 0.02
      case x if x <= 200000  => 0.04
      case x if x <= 2000000 => 0.035
      case x if x > 2000000  => 0.065
    }

    val rate = interestRate(depo)
    val interestValue = depo * rate

    interestValue
  }

  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount: ")
    val deposit = readDouble()

    val interestValue = interest(deposit)
    println(s"Interest calculated for $deposit is: $interestValue")
  }
}

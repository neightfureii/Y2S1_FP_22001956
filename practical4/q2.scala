object q2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as an argument.")
    } else {
      try {
        val input = args(0).toInt
        input match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
      } catch {
        case _: NumberFormatException => println("Please provide a valid integer.")
      }
    }
  }
}

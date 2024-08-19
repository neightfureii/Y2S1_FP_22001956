object PatternMatching {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer as input.")
    } else {
      try {
        val inputnumber = args(0).toInt

        val result = inputnumber match {
          case n if n <= 0     => "Negative/Zero is input."
          case n if n % 2 == 0 => "Even number is given."
          case _               => "Odd number is given."
        }

        println(result)
      } catch {
        case _: NumberFormatException =>
          println("Please provide a valid integer as input.")
      }
    }
  }
}

object q3 {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    names.foreach { name =>
      val formattedName = name match {
        case "Benny" => formatNames(name)(toUpper)
        case "Niroshan" =>
          formatNames(name) { n =>
            toUpper(n.substring(0, 2)) + toLower(n.substring(2))
          }
        case "Saman" => formatNames(name)(toLower)
        case "Kumara" =>
          formatNames(name) { n =>
            toUpper(n.substring(0, 1)) + toLower(
              n.substring(1, n.length - 1)
            ) + toUpper(n.substring(n.length - 1))
          }
        case _ => name
      }
      println(formattedName)
    }
  }
}

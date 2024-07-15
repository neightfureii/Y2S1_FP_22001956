import scala.io.StdIn.readLine

object q1 {
  def getProductList(acc: List[String]): List[String] = {
    val input = readLine("Enter product name(type 'done' to end.): ")
    if (input.toLowerCase() == "done") acc.reverse
    else getProductList(input :: acc)
  }

  def printProductList(products: List[String]): Unit = {
    for (i <- products.indices) {
      println(s"${i + 1}) ${products(i)}")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList(Nil)
    println("Products entered: ")
    printProductList(products)
    println(s"Total number of products: ${getTotalProducts(products)}")
  }
}

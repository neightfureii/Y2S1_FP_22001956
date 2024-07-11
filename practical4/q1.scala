object q1 {
  var itemNames: Array[String] =
    Array("Book", "Pencil", "Pen", "Eraser")
  var itemQuantities: Array[Int] = Array(20, 30, 40, 50)

  def displayInventory(): Unit = {
    for (i <- itemNames.indices) {
      println(s"Item: ${itemNames(i)}\nQuantity: ${itemQuantities(i)}\n")
    }
  }

  def restockItem(item: String, qty: Int): Unit = {
    var index = itemNames.indexOf(item)
    if (index >= 0) {
      itemQuantities(index) += qty
      println(s"Restocked $qty of $item successfully.")
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def sellItem(item: String, qty: Int): Unit = {
    var index = itemNames.indexOf(item)
    if (index >= 0) {
      if (itemQuantities(index) >= qty) {
        itemQuantities(index) -= qty
        println(s"Sold $qty of $item successfully.")
      } else {
        println(s"Insufficient quantity of $item in the inventory.")
      }
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    restockItem("Brush", 50)
    sellItem("Brush", 50)
    displayInventory()

    restockItem("Book", 30)
    sellItem("Book", 20)
    sellItem("Book", 50)
    displayInventory()
  }
}

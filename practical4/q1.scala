object q1 {
  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(50, 30, 20)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough quantity of $itemName to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $itemName does not exist in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apple", 10)
    displayInventory()
    sellItem("Banana", 15)
    displayInventory()
    sellItem("Orange", 25)
    displayInventory()
  }
}

object q1 {
    case class Product(name: String, quantity: Int, price: Double)

    val inventory1: Map[Int, Product] = Map(
        101->Product("P1A",10,5.0),
        102->Product("P1B",5,12.0),
        103->Product("P1C",8,7.5)
    )

    val inventory2: Map[Int, Product] = Map(
        201->Product("P2A",3,14.9),
        202->Product("P2B",2,9.0)
    )

    def getProductNames(inventory: Map[Int, Product]): Seq[String] = {
        inventory.values.map(_.name).toSeq
    }

    def calculateTotalValue(inventory: Map[Int, Product]): Double = {
        inventory.values.map(product => product.quantity * product.price).sum
    }

    def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
        inventory.isEmpty
    }

    def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = {
        (inventory1.keySet ++ inventory2.keySet).map { id => 
            val product1 = inventory1.get(id)
            val product2 = inventory2.get(id)
            val mergedProduct = (product1, product2) match {
                case (Some(p1), Some(p2)) =>
                    Product(p1.name, p1.quantity + p2.quantity, Math.max(p1.price, p2.price))
                case (Some(p1), None) => p1
                case (None, Some(p2)) => p2
                case (None, None) => throw new IllegalStateException("This should never happen")
            }
            id -> mergedProduct
        }.toMap
    }

    def checkProductExists(inventory: Map[Int, Product], productId: Int): Option[Product] = {
        inventory.get(productId)
    }

    def main(args: Array[String]): Unit = {
        println("Product names in inventory1: " + getProductNames(inventory1))
        println("Product names in inventory2: " + getProductNames(inventory2))

        println("\nIs inventory1 empty? " + isInventoryEmpty(inventory1))
        println("Is inventory2 empty? " + isInventoryEmpty(inventory2))

        val mergedInventory = mergeInventories(inventory1, inventory2)
        println("\nMerged inventory: " + mergedInventory)

        checkProductExists(inventory1, 102) match {
            case Some(product) => println(s"Product with ID 102: $product")
            case None => println("Product with ID 102 does not exist in inventory1")
        }
    }
}
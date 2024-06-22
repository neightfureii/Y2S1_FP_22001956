object q4 {
    def main(args: Array[String]) {
        def attendance(price: Int) = {
            120 + 20 * ((15 - price) / 5)
        }

        def profit(price: Int) = {
            val att = attendance(price)
            val revenue = price * att
            val cost = 500 + 3 * att
            revenue - cost
        }

        val profit5 = profit(5)
        val profit15 = profit(15)
        val profit10 = profit(10)
        val profit20 = profit(20)
        val profit25 = profit(25)
        val profit30 = profit(30)
        val profit35 = profit(35)

        println(s"Profit for ticket price = 5 : $profit5")
        println(s"Profit for ticket price = 10 : $profit10")
        println(s"Profit for ticket price = 15 : $profit15")
        println(s"Profit for ticket price = 20 : $profit20")
        println(s"Profit for ticket price = 25 : $profit25")
        println(s"Profit for ticket price = 30 : $profit30")
        println(s"Profit for ticket price = 35 : $profit35")
    }
}
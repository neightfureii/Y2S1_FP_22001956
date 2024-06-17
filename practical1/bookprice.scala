object bookprice {
	def main(args:Array[String]) {
		def price(n:Int, p:Double) = n*p
		def discount(p:Double) = 40/100 * p
		def totalprice(n:Int, p:Double) = price(n,p) - (n*discount(p))
		def shippingcost(n:Int) = if (n<=50) 3*n else ((3*50)+(n-50)*0.75)
		def totalwholesalecost(n:Int, p:Double) = totalprice(n,p) + shippingcost(n)

		println(totalwholesalecost(60, 24.95))
	}
}

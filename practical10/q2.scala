class Rationals(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def sub(that: Rationals): Rationals = {
    new Rationals(
      this.numerator * that.denominator - that.numerator * this.denominator,
      this.denominator * that.denominator
    )
  }

  override def toString: String = s"$numerator/$denominator"

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object q2 extends App {
  val x = new Rationals(3, 4)
  val y = new Rationals(5, 8)
  val z = new Rationals(2, 7)

  val result = x.sub(y.sub(z))

  println(s"x - (y - z) = $result")
}

class Account(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(f"Deposited $amount%.2f.\nNew balance: $balance%.2f\n")
    } else {
      println("Deposit amount must be positive.\n")
    }
  }

  def withdraw(amount: Double): Boolean = {
    if (amount <= balance) {
      balance -= amount
      println(f"Withdrew $amount%.2f.\nNew balance: $balance%.2f\n")
      true
    } else {
      println("Insufficient funds or invalid amount.\n")
      false
    }
  }

  def transfer(amount: Double, toAccount: Account): Boolean = {
    if (withdraw(amount)) {
      toAccount.deposit(amount)
      println(f"Transferred $amount%.2f to the target account.")
      true
    } else {
      println("\nTransfer failed.")
      false
    }
  }

  def getBalance: Double = balance

  override def toString: String = f"Account balance: $balance%.2f"
}

object q3 extends App {
  val account1 = new Account(1500.00)
  val account2 = new Account(200.5098237527)

  account1.transfer(500, account2)
}

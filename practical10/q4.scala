class Accountt(private var balance: Double) {
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

  def transfer(amount: Double, toAccount: Accountt): Boolean = {
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

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.10
    }
  }

  override def toString: String = f"Account balance: $balance%.2f"
}

class Bank(private var accounts: List[Accountt]) {
  def accountsWithNegativeBalances: List[Accountt] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAllAccounts(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  override def toString: String = {
    accounts.map(_.toString).mkString("\n")
  }
}

object q4 extends App {
  val account1 = new Accountt(1500.00)
  val account2 = new Accountt(-200.5098237527)
  val account3 = new Accountt(10.50)
  val account4 = new Accountt(-1000.20)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)

  println(f"\nTotal balance of all accounts: ${bank.totalBalance}%.2f")

  bank.applyInterestToAllAccounts()
  println("\nBalances after applying interest:")
  println(bank)
}

package oops

class OnlineStoreAccount(userName: String, balance:Int):

  def this(username:String) = {
    this(username, 0)
  }

  def this() = {
    this("admin", 100)
  }

  def check():Unit = {
    if (this.balance >= 20) {
      println(s"${this.userName} can buy ${math.floor(this.balance / 20).toInt} T-shirts")
    } else {
      println(s"${this.userName} has insufficient balance of ${this.balance} rs")
    }
  }


@main
def accountTest(): Unit = {

  val account1 = OnlineStoreAccount()
  val account2 = OnlineStoreAccount("Chaitanya")
  val account3 = OnlineStoreAccount("Sarvesh", 500)

  account1.check()
  account2.check()
  account3.check()

}

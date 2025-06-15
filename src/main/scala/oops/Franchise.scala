package oops

@main
def testFranchise(): Unit = {
  val myFranchise = Franchise()
  myFranchise.prepareBurgers()
}

class Restaurant:
  protected def applyFormula(): Unit = println("cook food with love and care..")

class Franchise extends Restaurant:

  def prepareBurgers(): Unit = {
    println("preparing burgers..")
    applyFormula()
  }

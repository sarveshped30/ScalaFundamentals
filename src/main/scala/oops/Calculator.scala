package oops

class Calculator:
  var total = 0D


  def add(num: Int): Unit = total += num

  def subtract(num: Int): Unit = total -= num

  def multiply(num: Int): Unit = total *= num

  def divide(num: Int): Unit = total = total.doubleValue / num

  def reset():Unit = total = 0

  def display(): Unit = println(s"Total amount is $total")


@main
def test(): Unit = {

  val calculator = Calculator()

  calculator.add(100)
  calculator.display()

  calculator.subtract(50)
  calculator.display()

  calculator.multiply(3)
  calculator.display()

  calculator.divide(2)
  calculator.display()

  calculator.reset()
  calculator.display()
  
}
package functions

import scala.collection.mutable.ArrayBuffer

@main
def initHOF(): Unit = {

  val divide = (num: Int) => num / 10

  val numbers = ArrayBuffer(456, 674, 78, 10, 9)
  divider(numbers, divide)
  println(numbers)

}

//divide: Int => Int is Lambda expression passed to divider Higher order function
def divider(numbers: ArrayBuffer[Int], divide: Int => Int) : Unit = {
    for(i <- numbers.indices) {
      numbers(i) = divide(numbers(i))
    }
}

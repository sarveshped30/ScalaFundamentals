package collections

import scala.collection.mutable.ArrayBuffer


//ArrayBuffer is mutable dynamic array, just like arraylist in java
@main
def arrayBuffer(): Unit = {

  val customers = ArrayBuffer[String]("Sarvesh", "Romil", "Chaitanya", "Prathamesh")
  println(customers)

  customers.addOne("Rutik")
  println(customers)


  customers.remove(customers.indexOf("Sarvesh"))
  println(customers)

}
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

  val items = ArrayBuffer[String]("laptop", "mouse", "pen", "paper", "mug", "phone")
  println(items)

  val removedItems = ArrayBuffer[String]("pen", "paper", "mug", "phone")

  items --= removedItems
  println(items)

  val zoo = ArrayBuffer[String]("lion", "zebra", "chimp", "elephant")
  println(zoo)

  zoo.addOne("panda")
  println(zoo.toList)

  zoo.remove(zoo.indexOf("lion"))
  println(zoo)

  val hasElephantsAnGiraffes = zoo.contains("elephant") && zoo.contains("giraffes")
  println(s"Does the zoo have both elephant and giraffes? : $hasElephantsAnGiraffes")

}
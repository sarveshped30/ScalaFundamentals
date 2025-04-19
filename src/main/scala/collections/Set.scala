package collections

import scala.collection.mutable

@main
def set(): Unit = {

  val customers = mutable.HashSet[String]("Sarvesh", "Romil", "Chaitanya")
  println(customers)

  customers.add("vardam")
  println(customers)

  customers.remove("Sarvesh")
  println(customers)

  customers.addAll(Set("Sarvesh", "Rutik"))
  println(customers)

  customers --= Set("Romil", "Sarvesh")
  println(customers)

  customers ++= Set("Sarvesh", "Romil")
  println(customers)

  val acceptedColors = mutable.HashSet("white", "black", "gray")
  val myColors = Set("blue", "red", "black", "green")

  println(s"Company accepted colors : $acceptedColors")
  println(s"my Colors : $myColors")

  var wearables = acceptedColors.intersect(myColors)
  var non_Wearables = myColors.diff(acceptedColors)

  println(s"Colors which i can wear : $wearables")
  println(s"Colors which i cannot wear : $non_Wearables")

  acceptedColors.add("red")
  println(s"Company's updated color list : $acceptedColors")

  wearables = acceptedColors.intersect(myColors)
  println(s"Updated Option's for wearables : $wearables")
}
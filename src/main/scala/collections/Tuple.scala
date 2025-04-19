package collections

@main
def tuple(): Unit = {
  val store = Tuple3(("Bhandup", 2467), ("Kanjur", 6739), ("Vikroli", 8796))
  println(store)
  
  val totalRevenue = store._1._2 + store._2._2 + store._3._2
  println(s"Total revenue from all the stores is : $totalRevenue")
  
  val storeNames = (store._1._1 , store._2._1 , store._3._1)
  println(storeNames)
  
}

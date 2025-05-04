package functions

import scala.io.StdIn

@main
def initF(): Unit = {

/*  print("Enter animal name : ")
  val animal = StdIn.readLine()
  val lifeSpan = checkLifeSpan(animal)
  println(s"\nLife span of $animal is $lifeSpan")*/

  val products = Map("Smartphone" -> 45_678D, "Tablet" -> 30_000D, "Laptop" -> 1_00_000D)

  addTax("Laptop", 1_00_000)
  addTax(products)

}

def checkLifeSpan(animal: String): Int = {
  val animals = Map("cats" -> 15, "dogs" -> 10, "rabbit" -> 12)
  var lifeSpan = 20
  if(animals.contains(animal)) {
    lifeSpan = animals(animal)
  }
  lifeSpan
}

//Function overloading (compile time polymorphism)

def addTax(product: String, prize: Double): Unit =  println(s"$product prize after applying 20% tax is ${prize * 1.20} Rs")

def addTax(products: Map[String, Double]): Unit = {
  for(product <- products.keySet) {
    println(s"$product prize after applying 20% tax is ${products(product) * 1.20} Rs")
  }
}
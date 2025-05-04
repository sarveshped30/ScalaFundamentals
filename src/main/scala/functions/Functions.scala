package functions

import scala.io.StdIn

@main
def init(): Unit = {

  print("Enter animal name : ")
  val animal = StdIn.readLine()
  val lifeSpan = checkLifeSpan(animal)
  println(s"\nLife span of $animal is $lifeSpan")

}

def checkLifeSpan(animal: String): Int = {
  val animals = Map("cats" -> 15, "dogs" -> 10, "rabbit" -> 12)
  var lifeSpan = 20
  if(animals.contains(animal)) {
    lifeSpan = animals(animal)
  }
  lifeSpan
}
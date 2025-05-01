package flowcontrol

import scala.io.StdIn

@main
def matchExp(): Unit = {

  val recommendedMealCount: Int = 3

  print(s"What is your meal count for a Day? : ")

  val mealCount: Int = StdIn.readLine().toInt

  val suggestion: String = mealCount match
    case x if 0 to 2 contains mealCount => s"$x is less, increase your meal count to $recommendedMealCount per day"
    case 3 => s"$recommendedMealCount meals is a good amount, keep going"
    case _ => s"Decrease your meal count to $recommendedMealCount per day"


  println(s"\n$suggestion")

}
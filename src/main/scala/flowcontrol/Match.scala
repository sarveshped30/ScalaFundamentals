package flowcontrol

import scala.io.StdIn

//@main
def mealMatch(): Unit = {

  val recommendedMealCount: Int = 3

  print(s"What is your meal count for a Day? : ")

  val mealCount: Int = StdIn.readLine().toInt

  val suggestion: String = mealCount match
    case x if 0 to 2 contains mealCount => s"$x is less, increase your meal count to $recommendedMealCount per day"
    case 3 => s"$recommendedMealCount meals is a good amount, keep going"
    case _ => s"Decrease your meal count to $recommendedMealCount per day"


  println(s"\n$suggestion")

}

@main
def hourMatch(): Unit = {

  print(s"Input Current Hours : ")
  val hours: Int = StdIn.readLine().toInt

  val time: String = hours match
    case x if 6 to 11 contains x => "morning"
    case x if 12 to 14 contains x => "noon"
    case x if 15 to 17 contains x => "afternoon"
    case x if 18 to 21 contains x => "evening"
    case x if 1 to 5 contains x => "night"
    case 22 => "night"
    case _ => throw new IllegalArgumentException("Invalid input..")

  println(s"\nTime of the day : $time")
}
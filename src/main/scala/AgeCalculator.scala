import java.time.Year
import scala.io.StdIn

@main
def ageCalculator() : Unit = {

  print("Hello, please enter your birth year : ")

  try {
    val birthYear: Int = StdIn.readInt()
    val currentYear: Int = Year.now().getValue
    val age: Int = currentYear - birthYear
    println(s"you're age is $age years")

  } catch {
    case _: NumberFormatException => println("Please enter a valid number for birth year.");
    case _: Exception => println("Unable to calculate age due to invalid input");
  }

}

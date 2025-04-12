import scala.io.StdIn
import scala.util.Random

@main
def userInput(): Unit = {
  print("Hello, Please enter your name below: ");
  val name: String = StdIn.readLine();

  println(s"Welcome $name");

  println(Random.nextInt())
  println(Random.nextInt(100))
  println(Random.nextInt(1000))

}

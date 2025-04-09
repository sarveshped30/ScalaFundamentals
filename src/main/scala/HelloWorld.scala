// Scala 3

//@main
def welcome() = println("Welcome Sarvesh to the World of Scala..");


// Scala 2

/*object Welcome {

  def main(args: Array[String]) = print("Welcome to the World of Scala..")
}*/

//Documentation comment
/**
 * @since
 *
 */

@main
def main(): Unit = {
  println("Another way of creating main method in scala")

  val name : String = "Sarvesh";    //Immutable variable
  var age: Int = 24;
  age = 25;
  //name = "Romil";    //Cannot be modified

  println("Age of " + name + " is " + age);

}


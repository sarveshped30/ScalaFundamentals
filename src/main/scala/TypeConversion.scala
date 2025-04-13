import scala.io.StdIn

@main
def typeConversion(): Unit = {


  print("Enter number : ");

  val num1 : Int = StdIn.readLine().toInt;
  val num2 = 4567.894;

  println(s"User input number type is : ${num1.getClass} ");
  println(s"Created Variable type is : ${num2.getClass}");

  val num3 = num1 * num2;
  println(s"product result of two is $num3 & it's type is ${num3.getClass}");
}
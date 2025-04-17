import scala.io.StdIn
import scala.math.BigDecimal.RoundingMode

@main
def interestCalculation(): Unit = {

  print("Welcome to your Bank!, please enter your name : ")
  val customerName : String = StdIn.readLine()
  
  println(
    s"""
      |Welcome $customerName, Thank you for choosing us to avail loan,
      |please provide us with more details as mentioned below..
      |""".stripMargin)

  print("LoanAmount : ")
  val loanAmount : Long = StdIn.readLong()
  print("\n")
  println(
    """
      |Please choose the tenure and there corresponding EMI Option
      |1) 4 months = 0.05%
      |2) 6 months = 0.07%
      |3) 8 months = 0.09%
      |4) 12 months = 0.11%
      |5) 16 months = 0.13%
      |
      |
      |""".stripMargin)
  print("Choose Tenure Option from above : ")
  val tenureOpt : Int = StdIn.readInt()
  var tenure : Int = -1
  var interestRate : Float = 0.0F

  tenureOpt match {
    case 1 =>
      tenure = 4
      interestRate = 0.05
    case 2 =>
      tenure = 6
      interestRate = 0.07
    case 3 =>
      tenure = 8
      interestRate = 0.09
    case 4 =>
      tenure = 12
      interestRate = 0.11
    case 5 =>
      tenure = 16
      interestRate = 0.13
    case _ => throw new IllegalArgumentException("please choose valid option..")
  }

  println(s"Thanks $customerName!, Your Selected Tenure is $tenure & IR is $interestRate")
  var emi : Double = (loanAmount / tenure) * (interestRate + 1)
  emi = BigDecimal.valueOf(emi).setScale(2, RoundingMode.HALF_UP).toDouble
  val totalRepayment = emi * tenure


  println(s"Your EMI amount is $emi & Total repayment amount is $totalRepayment")

 }

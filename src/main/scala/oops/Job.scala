package oops

class Job:
  var name:String = _
  private var revenue:Double = _
  var salary:Double = _

  def work(): Unit =
    revenue += salary

  def study(): Unit =
    salary += salary*0.5

  def display():Unit = println(s"$name has $salary Rs as salary and $revenue Rs in revenue...")



class Engineer extends Job



class Doctor extends Job


@main
def testInheritance(): Unit = {

  val doctor = Doctor()
  doctor.name = "Sonali"
  doctor.salary = 30_000

  val engineer = Engineer()
  engineer.name = "Sarvesh"
  engineer.salary = 1_16_000

  doctor.work()
  doctor.display()
  doctor.study()
  doctor.work()
  doctor.display()

  engineer.work()
  engineer.display()
  engineer.study()
  engineer.work()
  engineer.display()


}



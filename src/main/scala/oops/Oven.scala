package oops


@main
def testOven(): Unit = {
  val bosch:Oven = Bosch();
  bosch.speed()
  bosch.temperature()
  bosch.cook()


  val roaster:Oven = Roaster()
  roaster.speed()
  roaster.temperature()
  roaster.cook()
}

abstract class Oven:

  def speed(): Unit

  def temperature(): Unit

  def cook(): Unit = println("cook")

class Bosch extends Oven {

  def speed(): Unit = println("high speed")

  def temperature(): Unit = println("high temperature")

}

class Roaster extends Oven {

  override def speed(): Unit = println("average speed")

  override def temperature(): Unit = println("average temperature")

  override def cook(): Unit = println("Roast...")
}





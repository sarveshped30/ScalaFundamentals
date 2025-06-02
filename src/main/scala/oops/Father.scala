package oops

open class Father(lastName:String):
  protected var firstName:String = _

  def this(firstName:String, lastName:String) = {
    this(lastName)
    this.firstName = firstName
  }

  def setFirstName(firstName:String): Unit = this.firstName = firstName

  def name(): Unit = println(s"Father's name is $firstName $lastName")

class Son(lastName:String) extends Father(lastName):
  private var sonFirstName:String = _

  def this(firstName:String, lastName:String) = {
    this(lastName)
    this.sonFirstName = firstName
  }

  override def setFirstName(firstName: String): Unit = this.sonFirstName = firstName

  def setFatherFirstName(firstName: String): Unit = super.setFirstName(firstName)

  override def name(): Unit = {
    println(s"Son's name is $sonFirstName $lastName")
    super.name()
  }


@main
def testInheritance2(): Unit = {

  val son = Son("Sarvesh", "Pednekar")
  son.setFatherFirstName("Suryakant")

  son.name()


}
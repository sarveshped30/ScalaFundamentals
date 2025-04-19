package collections

//List is Immutable  (we cannot change values inside it)
@main
def list(): Unit = {

  var list = List(1, 2, 3, 4)
  println(list)
  list = List(5, 6, 7, 8)

  println(list)

  //Fetching on Index
  println(list.apply(2))
  println(list(2))

  //Checking if prsent
  val contains: Boolean = list.contains(7)
  println(contains)

  //Checking length
  val size : Int = list.length
  println(s"size is : $size")

  val zoo = List[String]("Tiger", "Wolf", "Owl", "Eagle")

  println(s"No of animals in a Zoo are : ${zoo.length}")
  var secondAnimal : String = zoo(1)
  println(s"Second animal in ZOO is : $secondAnimal")
  secondAnimal = zoo.tail.head
  println(s"Second animal in ZOO is : $secondAnimal")


}
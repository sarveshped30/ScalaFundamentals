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
  print(s"size is : $size")


}
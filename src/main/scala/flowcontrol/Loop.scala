package flowcontrol

import scala.io.StdIn

@main
def emojiSquareMatrix(): Unit = {

  print(s"Enter a number : ")
  val num : Int = StdIn.readLine().toInt
  println()

  for(i <- 1 to num)
    for(j <- 1 to num)
      val rem: Int = (i+j) % 3
      rem match
        case 0 => print("\uD83D\uDE00\t")
        case 1 => print("\uD83E\uDD28\t")
        case 2 => print("\uD83D\uDE31\t")

    println()

}
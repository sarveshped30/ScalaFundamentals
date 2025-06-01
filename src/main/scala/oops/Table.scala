package oops

class Table:

  var height:Double = _
  var size:Int = _

  def adjustHeight(height:Double):Unit =
    this.height = height

  def adjustSize(size:Int):Unit =
    this.size = size

  def print():Unit = println(s"Height : $height & size : $size")



@main
def tableTest():Unit = {

  var table = Table()
  table.print()
  table.adjustHeight(5.4)
  table.adjustSize(60)
  table.print()

}
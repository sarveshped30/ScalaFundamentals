package collections

import scala.collection.mutable

@main
def map(): Unit = {

  val attendance = mutable.HashMap[String, Long]("23/09" -> 3756, "24/09" -> 4735, "25/09" -> 2836)
  println(attendance)

  attendance.addOne("26/09" -> 6789)
  println(attendance)

  attendance.addAll(Map("27/09" -> 6432, "28/09" -> 4321))
  println(attendance)

  val totalAttendance_25_26 : Long = attendance.getOrElse("25/09", 0L) + attendance.getOrElse("26/09", 0L)
  println(s"Total attendance on 25 & 26 of sept is : $totalAttendance_25_26")

  val attendanceFor22 = attendance.contains("22/09")

  if (!attendanceFor22) {
    println("There is no data available for 22 sept")
  } else {
    println(s"Attendance for 22 sept is ${attendance("22/09")}")
  }
}
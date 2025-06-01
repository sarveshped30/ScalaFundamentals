package oops

class Browser(name:String, message:String):
  println(s"$name: $message")


@main
def testBrowser(): Unit =  {
  val message = "Welcome to the Home Page"
  Browser("chrome", message)
  Browser("firefox", message)
  Browser("safari", message)
}
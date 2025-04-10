

@main
def stringFunctions(): Unit = {

  val myPet = "Crocodile pednekar";
  println(myPet.length);

  println(myPet.toLowerCase())  //De-capitalize whole String
  println(myPet.toUpperCase())  //Capitalize whole string
  println(myPet.capitalize)     //Capitalize first letter of string
  println(myPet.trim)           //Trims Left most and right most spaces
  println(myPet.charAt(2))      //Get char at index
  println(myPet(2))             //Scala way to get char on index
  println(myPet.substring(2))   //Start inclusive
  println(myPet.substring(2, 7))  // Start inclusive and end exclusive

  //Interpolation
  println(s"My Pet name is $myPet");
  println(s"My Pet name is ${myPet.split(" ").head} and surname is ${myPet.split(" ").tail.head}");

  //Pipe are the margin, not necessary to add (its optional)
  //.stripMargin at end trims any char before '|'
  println("""
      |Hello i am trying multiLine String
      |Its awesome feature
      |This feature is available in java as well
      """.stripMargin)

}

package oops

@main
def olympics(): Unit =  {

  for (position <- 1 to 5) {
    getMedal(position).printMessage()
  }
}


enum Medal(message: String){
  case GOLD extends Medal("you won Gold Medal")
  case SILVER extends Medal("you won Silver Medal")
  case BRONZE extends Medal("you won Bronze Medal")
  case NONE extends Medal("Hard luck, fell short this time, best of luck for next time..")

  def printMessage(): Unit = println(message)
}

def getMedal(position: Int): Medal = {
  position match
    case 1 => Medal.GOLD
    case 2 => Medal.SILVER
    case 3 => Medal.BRONZE
    case _ => Medal.NONE
}

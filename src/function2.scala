def normalFunc(s: => String) = {
  println("normalFunc called")

  println("normalFunc recieved1: " + s)
  println("normalFunc recieved2: " + s)
}

def calledByName() = {
  println("called by name")
  "calledByName"
}

normalFunc(calledByName())

object FunctionExample {
  def main(args: Array[String]):Unit = {
    var calculate = (x:Int) => x+5 : Int
    // calculate = (x:Int) => x+6 : Int

    printf("y=%d \n", calculate(1))
    printf("y=%d \n", calculate(2))
  }
}

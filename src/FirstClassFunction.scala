object FirstClassFunction {
  def main(args: Array[String]):Unit = {
    val add = (x:Int) => {
      val _add = (y:Int) => y + 5
      _add
    }
    printf("add = %s \n", add(1))
    printf("add = %s \n", add(2))
    printf("add = %s \n", add(1))

    printf("addd = %s \n", addd(1))
    printf("addd = %s \n", addd(2))
    printf("addd = %s \n", addd(1))
  }

  // Method
  def addd(x:Int):Int = {
    // x = 4//error: reassignment to val
    // x += 4//error: value += is not a member of Int

    // Function
    val _addd = (y:Int) => y + 5 : Int
    _addd(x)
  }
}

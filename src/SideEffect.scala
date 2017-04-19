object SideEffect {
  var total = 0

  def main(args: Array[String]):Unit = {
    var add = (x: Int) => {
      total += x
      total
      // "test"
    }
    // }:Int

    printf("total = %s\n", add(1))
    printf("total = %s\n", add(1))
    printf("total = %s\n", add(1))
  }
}

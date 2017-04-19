object HelloWorld {
  def main(args: Array[String]) : Unit = {
    val strs = Array("Hello", "World");
    if (args.size == 0) {
      output(strs)
    } else {
      println("Invalid args.");
      // strs = strs :+ args
    }
  }

  def output(strs:Array[String]):Unit = {
    for (str <- strs) {
      printf("%s ", str)
    }
  }

  // def output(strs: Array[String]):Unit = {
  //   strs.foreach(printf("%s ", _))
  //   print("\n");
  // }
}

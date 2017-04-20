object Closure {
  def main(args: Array[String]):Unit = {
    val candidates = List(1,2,3,4,5)

    val filter = (predicate: Int => Boolean) => {
      (candidates: List[Int]) => {
        for (x <- candidates; if predicate(x)) yield x
      }:List[Int]
    }

    val predicate = (x: Int) => x % 2 == 0

    // var oodFilter = filter(predicate)
    // oodFilter(candidates).foreach(println)
    filter(predicate)(candidates).foreach(println)
  }
}

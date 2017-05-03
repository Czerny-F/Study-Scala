// for(i <- 1 to 10) {
//   println(i)
// }

for(i <- 0 until 10; if i % 2 == 0) {
  println(i)
}

// val list = 1 to 10
val list = 1.to(10)
val y = for (i <- list if i % 2 == 0) yield {
  println(i)
  i/2
}

println(y)

// val mul = for (x <- 1 until 10; y <- 1.until(10)) yield {
val mul = for {
  x <- 1 until 10
  y <- 1.until(10)
} yield {
  print(s"$x*$y=${x*y} ")
  if (y == 9) println
  x * y
}

println(mul)

val mul2 = for (x <- 1 until 10) yield {
  for (y <- 1.until(10)) yield {
    x * y
  }
}

mul2.foreach {
// mul2.foreach { i =>
//   println(i)
  println
}

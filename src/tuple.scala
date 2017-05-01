val a = 5
val b = 3

val tuple = (a+b, a-b, a*b, a/b)

val (add, sub, mul, div) = tuple

println(add)
println(sub)
println(mul)
println(div)

val tuple1 = tuple -> a%b
println(tuple1)

val map = Map(
  1 -> "Apple",
  2 -> "Banana",
  3 -> "Cherry"
)

println(map)

val _map = Map(
  (1, "Apple"),
  (2, "Banana"),
  (3, "Cherry")
)

println(_map)

// def add(a: Int, b: Int) = {
def add(a: Int, b: Int = 1): Int = {
  a + b
  return a + b
  // println(a+b)
}

println(add(3, 5))
println(add(10, 7))
println(add(10))
println(add(a = 5, b = 3))

def func = "func called"

println(func)
// println(func())

def func2() = {"func2 called"}

println(func2)
println(func2())

def func3 {println("func3 called")}

func3

def sum(v: Int*) = {println(v); v.sum}
println(sum(1))
println(sum(1,2,3,4,5))

def array = Array(6,7,8)
println(sum(array:_*))

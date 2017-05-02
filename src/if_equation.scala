val name = "CODEPREP"
// val name = "codeprep"

val any = if (name == "CODEPREP") {
  s"Hello ${name}"
} else {
  -1
}

// error: value toUpperCase is not a member of Any
println(any.toUpperCase)

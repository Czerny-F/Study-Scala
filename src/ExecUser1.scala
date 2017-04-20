class User(
  private val id: Long,
  private val firstname: String,
  private val lastname: String,
  private val fullname:Fullname = new Fullname
) {
  // delegation?
  // Strategy pattern?
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(name1: String, name2: String) = name1 + " " + name2
}

class FullnameInJapan() extends Fullname {
  override def get(name1: String, name2: String) = name2 + " " + name1
}

val user1 = new User(1, "first", "last")
println(user1.getFullname)

val user2 = new User(2, "first", "last", new FullnameInJapan)
println(user2.getFullname)

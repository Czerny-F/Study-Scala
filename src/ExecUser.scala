object Main {
  def main(args: Array[String]) {
    val user = new User(1, "First", "Last")
    println(user.getFullname())
    // println(user.id)//error: value id in class User cannot be accessed in this.User
  }
}

class User(
  private val id: Long,
  private val firstname: String,
  private val lastname: String
) {
  def getFullname() = this.firstname + " " +  this.lastname
}

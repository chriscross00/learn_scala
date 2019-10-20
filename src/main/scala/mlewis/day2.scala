package mlewis

class day2 {
  val age: Int

  val response = if(age < 18) {
    "no admittance"
  } else {
    "come in"
  }
  println(response)
}

object test {
  def main(args: Array[String]): Unit = {
    val thirdDay = new day2(20)

  }
}

package mlewis

class day3 {
  for (i <- 0 to 10)
      for (j <- 'a' until 'd') {
        println(i + "" + j)
  }
}

object someThing {
  def main(args: Array[String]): Unit = {

    val someJello = new day3
    println("jello world")
  }
}

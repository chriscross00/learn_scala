package mlewis

class day3 {

  def learnMatch(): Unit = {
    val fizbuzz = for(i <- 1 to 20)  yield {
      (i%3, i%5) match {
        case(0, 0) => "fizzbuzz"
        case (0, _) => "fizz"
        case(_, 0) => "buzz"
        case _ => i.toString
        }
    }
  }
}

object someThing {
  def main(args: Array[String]): Unit = {

    val someJello = new day3
    println(someJello.learnMatch)
    println("jello world")
  }
}

package santos.examples
import Spiral.spiral

object Example1 {
  def main(args: Array[String]): Unit = {
    val nSides = args(0).toInt
    println(spiral(nSides, 0))
  }
}


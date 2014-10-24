package euler.solutions

/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

object Solution006 extends App {
   def sumOfSquares(ns: Vector[Int]): Int = {
     ns.reduceLeft { (s, x) =>
      s + math.pow(x, 2).toInt
     }
   }

  def squareOfSum(ns: Vector[Int]): Int = {
    math.pow(ns.sum, 2).toInt
  }

  val ns = (1 to 100).toVector
  val answer = squareOfSum(ns) - sumOfSquares(ns)

  assert(answer == 25164150)
}

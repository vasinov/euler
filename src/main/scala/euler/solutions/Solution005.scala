package euler.solutions

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

object Solution005 extends App {
  def divisibleByAll(start: Int, ns: Vector[Int]): Int = {
    if (ns.filter(x => start % x != 0).isEmpty) start else divisibleByAll(start + 1, ns)
  }

  val answer = divisibleByAll(2520, (1 to 20).toVector)

  assert(answer == 232792560)
}

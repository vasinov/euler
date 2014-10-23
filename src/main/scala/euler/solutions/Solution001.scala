package euler.solutions

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Solution001 extends App {
  val answer = (0 until 1000).toVector.reduceLeft((l, r) => if (r % 5 == 0 || r % 3 == 0) l + r else l)

  assert(answer == 233168)
}

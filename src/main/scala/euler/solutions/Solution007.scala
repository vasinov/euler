package euler.solutions

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

object Solution007 extends App {
  lazy val nthPrime: Stream[Int] = {
    Stream.from(2).filter(x => (2 to (x - 1)).toVector.filter(y => x % y == 0).isEmpty)
  }

  val answer = nthPrime.take(10001).last

  assert(answer == 104743)
}

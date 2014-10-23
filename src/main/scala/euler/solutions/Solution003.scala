package euler.solutions

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

object Solution003 extends App {
  def primeFactors(n: Long): Vector[Long] = {
    (2 to math.sqrt(n).toInt)
      .find(n % _ == 0)
      .map(i => i.toLong +: primeFactors(n / i))
      .getOrElse(Vector(n))
  }

  val answer = primeFactors(600851475143L).last

  assert(answer == 6857)
}

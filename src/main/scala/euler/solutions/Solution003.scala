package euler.solutions

import euler.helpers.EulerMath

object Solution003 extends App with EulerMath {
  val answer = primeFactors(600851475143L).last

  assert(answer == 6857)
}

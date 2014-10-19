package euler.solutions

import euler.helpers.{EulerStrings, EulerMath}

object Solution004 extends App with EulerMath with EulerStrings {
  lazy val answer = (1 to 999).reverse
    .flatMap(i => (i to 999).reverse.map(y => y * i))
    .filter(n => isPalindrome(n))
    .max

  assert(answer == 906609)
}

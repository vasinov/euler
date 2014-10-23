package euler.solutions

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

object Solution004 extends App {
  def isPalindrome[T <: Int](number: T): Boolean = {
    number.toString == number.toString.reverse
  }

  lazy val answer = (1 to 999)
    .flatMap(i => (i to 999).map(y => y * i))
    .filter(n => isPalindrome(n))
    .max

  assert(answer == 906609)
}

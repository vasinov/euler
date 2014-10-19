package euler.helpers

trait EulerStrings {
  def isPalindrome[T <: Int](number: T): Boolean = {
    number.toString == number.toString.reverse
  }
}

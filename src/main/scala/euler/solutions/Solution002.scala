package euler.solutions

import euler.helpers.EulerMath

object Solution002 extends App with EulerMath {
  val answer = fibs.takeWhile(_ <= 4000000).reduceLeft((count, value) =>
    if (value % 2 != 0) count + value
    else count
  )

  assert(answer == 4613732)
}

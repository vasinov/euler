package euler.solutions

object Solution001 extends App {
  val answer = (0 until 1000).toVector.reduceLeft((l, r) => if (r % 5 == 0 || r % 3 == 0) l + r else l)

  assert(answer == 233168)
}

package euler.helpers

import scala.math.BigInt

trait EulerMath {
  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  val fibs2: Stream[BigInt] = {
    def loop(h: BigInt, n: BigInt): Stream[BigInt] = h #:: loop(n, h + n)
    loop(0, 1)
  }

  val fibs3: Stream[BigInt] = 0 #:: fibs3.scanLeft(BigInt(1))(_ + _)
}

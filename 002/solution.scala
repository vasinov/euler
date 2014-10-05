import scala.math.BigInt

lazy val fibs: Stream[BigInt] = BigInt(0) #::
                                BigInt(1) #::
                                fibs.zip(fibs.tail).map { n => n._1 + n._2 }

fibs.takeWhile(_ <= 4000000).reduceLeft((count, value) =>
  if (value % 2 != 0)
    count + value
  else
    count
)

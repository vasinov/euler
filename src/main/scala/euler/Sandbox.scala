package euler

import euler.helpers.{Profiling, EulerMath}

object Sandbox extends App with EulerMath with Profiling {
  time { println((fibs take 10).toList) }
  time { println((fibs2 take 10).toList) }
  time { println((fibs3 take 10).toList) }
}

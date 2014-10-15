package euler.helpers

trait Profiling {
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()

    println(s"Elapsed time: ${(t1 - t0) / 1e9} seconds")

    result
  }
}

(0 until 1000).reduceLeft((l, r) => if (r % 5 == 0 || r % 3 == 0) l + r else l)

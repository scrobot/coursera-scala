def abs(x:Double) = if (x < 0) -x else x

def sqrt(x: Double) = {
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) = abs(guess * guess - x) / x < 0.0001

  def improve(guess: Double) = (guess + x / guess) / 2

  sqrtIter(1.0)
}

sqrt(4.0)
sqrt(8.0)
sqrt(0.0001)
sqrt(1e-20)
sqrt(1e20)
sqrt(1e50)
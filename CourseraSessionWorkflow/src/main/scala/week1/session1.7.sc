def factorial(n: Int): Int  = {
  if(n == 1) n * 1 else factorial(n * n - 1)
}

// if(5 == 1) 5 * 1 else factorial(5 * 5 - 1)
// if(5 == 0) 5 else factorial(5 * factorial(4))
// if(5 == 0) 5 else factorial(5 * 4)
// if(5 == 0) 5 else factorial(20)
// if(20 == 0) 20 else factorial(20 * (20 - 1))

factorial(5)
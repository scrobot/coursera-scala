package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      if(chars.isEmpty || chars.head.toString == ")") false

      def findBalancing(chars: List[Char], balance: Int = 0): Boolean = {
        if(chars.isEmpty) balance == 0
        else if(chars.head.toString == "(") findBalancing(chars.tail, balance + 1)
        else if(chars.head.toString == ")") balance > 0 && findBalancing(chars.tail, balance - 1)
        else findBalancing(chars.tail, balance)
      }

      findBalancing(chars)
    }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def iter(money: Int, coins: List[Int], count: Int = 0): Int = {
      if(money == 0) count + 1
      else if(money < 0 || coins.isEmpty) count
      else if(money / coins.head >= 0) iter(money - coins.head, coins, count) + iter(money, coins.tail, count)
      else count
    }

    iter(money, coins)
  }
}

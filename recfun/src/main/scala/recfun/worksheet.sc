
def countChange(money: Int, coins: List[Int]): Int = {

    def iter(money: Int, coins: List[Int], count: Int = 0): Int = {
      if(money == 0) count + 1
      else if(money < 0 || coins.isEmpty) count
      else if(money / coins.head >= 0) iter(money - coins.head, coins, count) + iter(money, coins.tail, count)
      else count
    }

    iter(money, coins)
}


countChange(4,List(1, 2))
countChange(301,List(5,10,20,50,100,200,500))
countChange(300,List(5,10,20,50,100,200,500))
countChange(300,List(500,5,50,100,20,200,10))
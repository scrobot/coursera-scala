import scala.io.StdIn

object MaxPairwise extends App {

    val list = inputParser()

    println(calculate(list))

    def calculate(list: => List[Int], result: Int = 0): Int = {
        println("list size: " + list.size)
        if(list.length <= 1) result
        else if(list.size >= 2 && (list.head * list.tail.head) > result) calculate(list.tail, list.head * list.tail.head)
        else calculate(list.tail, result)
    }

    def inputParser(): List[Int] = {
        val read = StdIn.readLine()

        try {
          read.split(" ").map(_.toInt).toList
        } catch {
            case e: Exception => Array[Int](0).toList
        }
    }

}

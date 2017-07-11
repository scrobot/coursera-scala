import scala.io.StdIn

/**
  * Created by aleksejskrobot on 11.07.17.
  */
object Test extends App {

  val inp = inputingReader()

  if(inp.length < 2) {
    println(0)
  } else {
    println(inp.head + inp.tail.head)
  }

  def inputingReader(): Array[Int] = {
    val read = StdIn.readLine()

    try {
      read.split(" ").map(x => x.toInt)
    } catch {
      case _: Exception => Array[Int](0)
    }
  }
}

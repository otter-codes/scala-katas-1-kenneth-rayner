
import scala.io.StdIn

object DisplayOdds extends App {


  def makeList(Number: Int): List[Int] = {
    val x = (1 to Number).toList
     val newList = x.filter(_ % 2 ==1)
    return newList
  }

  var yourNumber = StdIn.readLine("Enter your number:").toInt
  println(makeList(yourNumber))

val newlist  =(makeList(yourNumber))

}

//def intMap(list: List[Int], f: Int => Int): List[Int] = {
//if (list != Nil) {
//f(list.head) :: intMap(list.tail, f)
//} else {
//list
// List()
// Nil
//}
//}

//intMap(List(1,2,3), x => x + 2)

//intMap(List(1,2,3), x => x * 5)
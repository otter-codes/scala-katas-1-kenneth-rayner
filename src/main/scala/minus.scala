//package scala.App
import scala.io.StdIn

object minus extends App {


  def makeList (Number: Int)= {
    var x = ( Number * -1)
     x
  }
  val yourNumber = StdIn.readLine("Enter your number:").toInt
  println(makeList(yourNumber))
}


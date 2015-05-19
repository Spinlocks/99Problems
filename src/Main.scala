/**
 * Created by Farrell on 5/17/15.
 */
object Main {
  def main (args: Array[String]) {
    println(s"Hello World! ");

    println(s"Result to P01 with built in: " + P01.getLastElement(List(1, 2, 3)))
    println(s"Result to P01 with recursion: " + P01.lastElementManually(List(1,2,3)))

    println(s"Result to P02 with built in: " + P02.secondToLast(List(1,2,3)))

    println(s"Result to P03 with built in: " + P03.findKthElement(1, List(1,2,3)))
    println(s"Result to P03 with recursion: " + P03.findKthElementByMatch(1, List(1,2,3)))

    println(s"Result to P04 with built in: " + P04.numOfElementsInList(List(1,2,3)))
    println(s"Result to P04 with recursion: " + P04.numOfElementsWithMatch(List(1,2,3)))

    println(s"Result to P05 with built in: " + P05.reverseList(List(1,2,3)))
    println(s"Result to P05 with built in: " + P05.reverseListRecur(List(1,2,3)))

    
  }
}

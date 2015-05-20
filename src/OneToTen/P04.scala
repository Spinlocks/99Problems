package OneToTen

/**
 * Created by Farrell on 5/18/15.
 */
object P04 {
  def numOfElementsInList[A](ls: List[A]) : Int = {
    return ls.length;
  }

  def numOfElementsWithMatch[A](ls: List[A]) : Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + numOfElementsWithMatch(tail)
  }
}

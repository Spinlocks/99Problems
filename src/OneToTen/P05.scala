package OneToTen

/**
 * Created by Farrell on 5/18/15.
 */
object P05 {
  def reverseList[A](ls: List[A]) : List[A] = {
    ls.reverse
  }

  /* Need to learn about functions. Didn't know about triple quote */
  def reverseListRecur[A](ls : List[A]) : List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseListRecur(tail) ::: List(h)
  }
}

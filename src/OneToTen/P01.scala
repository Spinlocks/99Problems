package OneToTen

/**
 * Created by Farrell on 5/17/15.
 */
object P01 {
  /* Find the last element in a list the built in way */
  def getLastElement[A](ls: List[A]): A = {
    return ls.last;
  }

  /* Key learning after typing this and studying. The double colon
   * is a cons operator on a list. */
  def lastElementManually[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastElementManually(tail)
    case _  => throw new NoSuchElementException
  }
}

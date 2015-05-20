package OneToTen

/**
 * Created by Farrell on 5/17/15.
 */
object P03 {

  def findKthElement[A](ind: Int, ls : List[A]) : A = {
    if (ls == Nil || (ls.length <= ind) || (ls.isEmpty)) {
      throw new NoSuchElementException
    }
    return ls(ind);
  }

  def findKthElementByMatch[A](ind: Int, ls: List[A]): A = (ind, ls) match {
    case (0, h :: _ ) => h
    case (ind, _ :: tail) => findKthElementByMatch(ind-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}

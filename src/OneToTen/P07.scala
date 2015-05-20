package OneToTen

/**
 * Created by Farrell on 5/18/15.
 */
object P07 {
  /* Had to look at answer, what I didn't know: */
  /* Use of Any to match "Any" object, allow sub lists and elements */
  /* Flatmap, apply function to each element and concatenate results. No need to use triple colon */
  /* First case reads, assign current element in List to ls1. This is not the same as passed ls1
  *   Then ask if the current object is a list using underscore because we don't care about the type
   *   If it is, recurse flatten. */
  /* Second case is to assign elem to the current item, and since it's not a list convert because we
    passed through the first case. Then convert it to list to let flatMap append everything together
   */
  def flattenList(ls1 : List[Any]) : List[Any] = ls1 flatMap {
    case ls1: List[_] => flattenList(ls1)
    case elem => List(elem)
  }
}

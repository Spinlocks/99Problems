package OneToTen

/**
 * Created by Farrell on 5/20/15.
 */
object P09 {
  def packList[A](ls : List[A]) : List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (combined, rest) = ls.span( _ == ls.head)
      if (rest == Nil) List(combined)
      else combined :: packList(rest)
    }
  }
}

package OneToTen

/**
 * Created by Farrell on 5/20/15.
 */
object P08 {
  def compressList[A](ls : List[A]) : List[A] = ls match {
    case Nil => Nil
    case x :: tail => x :: compressList(tail.dropWhile(_ == x))
  }

  /* This can be solved functionaly, try it. Need to be able to read auto complete */
  /* def foldRight[B](z: B)(op: (A, B) ⇒ B): B */
  /* Folding explained, http://oldfashionedsoftware.com/2009/07/10/scala-code-review-foldleft-and-foldright/ */
  def compressFunc[A](ls : List[A]) : List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
}

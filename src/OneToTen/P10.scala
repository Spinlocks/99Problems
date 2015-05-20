package OneToTen

/**
 * Created by Farrell on 5/20/15.
 */
object P10 {
  /* Attempt at tail recursion, types were tricky, and annotation
   * can't be added because it's not actually tail recursive */
  def compress[A](ls : List[A]) : List[(Int, A)] = {
    val packedL = P09.packList(ls);
    def compressR(ls1 : List[List[A]]) : List[(Int, A)] = {
      if (ls1 == Nil) Nil
      else List((ls1.head.length, ls1.head.head)) ::: compressR(ls1.tail)
    }
    compressR(packedL)
  }

  def compress2[A](ls : List[A]) : List[(Int, A)] = P09.packList(ls) map {
    elem => (elem.length, elem.head)
  }
}

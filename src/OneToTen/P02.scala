package OneToTen

import java.util.NoSuchElementException

/**
 * Created by Farrell on 5/17/15.
 */
object P02 {
  /* First attempt, read doc more closely */
  def secondToLast[A](ls:List[A]) : A = {
    if (ls == Nil || ls.length < 2) {
      throw new NoSuchElementException
    } else {
      ls(ls.length - 2)
    }
  }

  /* Simple, clean built in way */
  def secondToLastBuiltIn[A](ls: List[A]) : A = {
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last
  }

  /* Pattern matching way. Need to play with underscore more. */
  def secondToLastPattern[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => secondToLastPattern(tail)
    case _ => throw new NoSuchElementException
  }
}

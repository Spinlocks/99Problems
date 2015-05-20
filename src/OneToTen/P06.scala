package OneToTen

/**
 * Created by Farrell on 5/18/15.
 */
object P06 {
  /* Don't like this solution even though I know it works */
  def isPalindrome[A](ls : List[A]) : Boolean = {
    ls == ls.reverse
  }
}

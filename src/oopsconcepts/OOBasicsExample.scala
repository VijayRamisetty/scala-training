package oopsconcepts

object OOBasicsExample extends App{

  val author = new Writer("martin", "odersky", 1958)
  val novel = new Novel("scala programming" , 2001, author)

  println(author.fullName)            // martin odersky
  println(novel.authorAge)            // 1958-2001 = 43 , at age 43 he released novel
  println(novel.isWrittenBy(author))  // true

  val author2 = new Writer("martin", "odersky", 1958)
  println(novel.isWrittenBy(author2))  // false

  val counter = new Counter           // defaults to 0
  counter.inc.print                   // 1
  counter.inc.inc.print               // 2
  counter.inc(10).print               // 10


}

/*
 Novel & Writer

 Writer
  - fields : firstName , surname, year
  - method : fullName

 Novel:
 - fields : name , yearOfRelease , author
 - methods : authorAge, isWrittenBy(author) : Boolean

 */

class Writer(firstName:String , surname : String , val year : Int ) {
  def fullName: String = firstName +" " +surname
}

class Novel(name:String , yearOfRelease : Int , author : Writer){

  def authorAge = yearOfRelease-author.year
  def isWrittenBy(author : Writer ) = author == this.author
  def copy(newYear:Int) : Novel = new Novel(name,newYear,author)
}

/*
 Counter
- receives an int
- method : current count
- method : increment / decrement - return new count
- overload : increment /decrement
 */

class  Counter(val count: Int = 0) {

  def inc = new Counter(count+1)
  def dec = new Counter(count-1)

  //def inc(n:Int) = new Counter(count+n)

  // inc using tail recursion
  def inc(n:Int) :Counter = {
    if(n<=0 ) this
    else inc.inc(n-1)
  }

  def dec(n:Int) = new Counter(count-n)

  def print = println(count)
}
/*
martin odersky
43
true
false
1
2
10
*/

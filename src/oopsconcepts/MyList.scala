package oopsconcepts

/**
 * Custom List implementation
 */

abstract class MyList {
  /*
   head = first element of the list
   tail = reminder of the list
   isEmpty = is list empty ?
   add(int) => new list with is element added
   toString = String representation of List
   */

  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(element:Int) :MyList

  def printElements :String
  // polymorphic call
  override def toString :String = "[" + printElements + "]"
}
object Empty extends MyList{

  override def head: Int = throw new NoSuchElementException
  override def tail: MyList = throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def add(element: Int): MyList = new Cons(element,Empty)

  override def printElements: String = ""
}

class Cons(h:Int,t:MyList ) extends MyList{

  override def head: Int = h
  override def tail: MyList = t
  override def isEmpty: Boolean = false
  override def add(element: Int): MyList = new Cons(element,this)

  override def printElements: String = {
    if(t.isEmpty) "" +h
    else h +" "+t.printElements
  }
}

object ListTest extends App{
  val list = new Cons(1,new Cons(2,new Cons(3,Empty)))
  println(list.head)      //1
  println(list.tail.head) // 2
  println(list.add(4).head)    // 4
  println(list.isEmpty)   // false

  println(list.printElements) // returns 3
}


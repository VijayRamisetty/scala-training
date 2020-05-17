package oopsconcepts

object Generics extends App {

  //Generics
  class  MyList[A] {
    // use type A
  }

  val listOfInt = new MyList[Int]
  val listOfString = new MyList[String]


  // Generic methods
  object  MyList{
    def empty[A] : MyList[A] = ???   // ??? returns nothing

  }

  val emptyList = MyList.empty[Int]


}

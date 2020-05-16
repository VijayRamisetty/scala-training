package oopsconcepts

/**
 *  CLASS-Level functionality & INSTANCE-Level functionality
 *  static ?
 *  objects in scala are Singleton Instances
 *  scala applications
 */
object Objects {

  /**
   * SCALA doesn't have class level functionality - i.e  static
   * as a pattern we create object Person & class Person with same name , in same file
   * to achieve both CLASS-Level functionality & INSTANCE-Level functionality
   * called as  [ COMPANIONS - Companions design patterns]
   *
   * also - we can have factory methods in singleton objects
   */

  // CLASS-Level functionality
  object Person {
    val N_EYEs = 2 // implementation  for static in scala
    def canFly: Boolean = false

    //we can have factory methods in singleton objects
    def apply(name: String): Person = new Person(name)
  }

  //INSTANCE-Level functionality
  class Person(val name: String) {

  }

  /**
   * SCALA Applications with def main(args: Array[String]): Unit
   * or
   * object FileName  extends App
   */

  def main(args: Array[String]): Unit  = {

    // CLASS-Level functionality
    println(Person.N_EYEs) // 2
    println(Person.canFly)

    /**
     * object Names cannot take parameters like classes
     * objects in scala are Singleton Instances by definition
     * new is not used
     */

    // scala object =====> Singleton Instance
    val mary = Person // new is not used
    val tom = Person // new is not used

    println(mary == tom) // true : reason singleton

    // class objects
    val p1 = new Person("john")
    val p2 = new Person("john")
    println(p1 == p2) // false

    // we can have factory methods in singleton objects
    // here Person singleton is working as factory pattern and  .apply  is creating class objects
    val p = Person.apply("Rob") // or val p = Person("Rob")
    println(p.name)

  }

}

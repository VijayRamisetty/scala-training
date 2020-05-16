package oopsconcepts

/**
 *
 *
 */
object Inheritance {

  class Animal{
    private def play = println("i am private in Animal") // private entries are accessible within the class Animal
    protected def jump: Unit =println("i am protected in Animal") // protected is accessible only inside a sub class
    def eat = println("nomnom")

    val createType = "wild"

    final val species ="animal" // as it is final it cannot be overridden
  }
  class Cat extends  Animal{

    def canCallProtected: Unit ={
      jump;   // child class Cat can call protected methods of Parents
    }

  }

  // CONSTRUCTORS
  class Person(name:String ,age: Int){

    def this(name:String)  = this(name,0)
  }
  // class Adult(name:String,age:Int , idCard :String) extends Person  // Unspecified value parameters: name: String, age: Int


  /**
   * Correct way of Child Adult extending a Parent class
   */
  class Adult(name:String,age:Int , idCard :String) extends Person(name,age)
  class Adult2(name:String,age:Int , idCard :String) extends Person(name)



  // over riding
  class Dog extends  Animal{
    override def eat: Unit = {
      super.eat  // super.eat calls parents eat function
      println("Dog crunch crunch")
    }

    override val createType: String = "domestic"

    ;
  }

  def main(args: Array[String]): Unit = {

    // Access modifiers
    //--------------------
    val cat = new Cat
    cat.eat  // nom nom
    // cat.play // Symbol play is inaccessible from this place
    // cat.jump   // Symbol jump is inaccessible from this place
    cat.canCallProtected   // i am protected in Animal

   // over riding methods & values
    //-----------------------
    val dog = new Dog
    dog.eat // Dog crunch crunch
    println(dog.createType)  // domestic

    /**
     * Preventing overriding
     * ----------------------
     * Final -
     * can be applied on members -- so no other class can override the members
     * can be applied on class --  so no other class can extend , example: String
     *
     * special way :  sealing
     *  " sealed class Animal "  --- then " only in this file it can have child classes"
     */




  }
}

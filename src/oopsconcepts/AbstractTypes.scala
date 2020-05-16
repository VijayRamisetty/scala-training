package oopsconcepts

object AbstractTypes extends  App {

  // abstract - class with  un implemented methods /un implemented methods
  // cannot create an object of an abstract class
  abstract  class Animal{
      val creatureType :String = "wild"
      val eat:Unit = println("hello")
  }

  class Dog extends  Animal{

    override val creatureType: String = "domestic"     // override key word is optional
    override val eat: Unit = println("dog eating...")
  }

  trait Carnivore{
    def eat(animal:Animal) :Unit
  }

  trait ColdBlooded{

  }


  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    override val eat: Unit = println("crush crush")
    override def eat(animal: Animal): Unit = println(s"I am croc, eating $animal")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
}

/**
 * Traits Vs Abstract classes
 *  - both can have abstract and non abstract methods / fields
 *  - differences:
 *      - traits dont have constructor parameters
 *      - multiple traits can be inherited using "with" , whereas abstract classes are inherited one
 * - when to use what
 *    - traits           : behaviour
 *    - abstract classes : thing
 *
 *    Scala.Any is parent of all classes
 */

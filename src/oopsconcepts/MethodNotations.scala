package oopsconcepts
/**
 infix notation (or) OPERATOR notation = aka  [ Syntactic Sugar ]
 Operators
 Prefix Notation
 Postfix Notation
 */
object MethodNotations extends  App {

  class  Person(val name:String, favouriteMovie: String, val age: Int = 0){
    def likes(movie: String) : Boolean =  movie == favouriteMovie
    def hangoutsWith(person: Person) : String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person) : String =  s"${this.name} is hanging out with ${person.name}"

    //exercise
    def +(nickName: String) : Person =  new Person(s"$name ($nickName) ", favouriteMovie)

    def unary_! : String = s"$name what the heck !"

    //exercise
    def unary_+ : Person = new Person(name,favouriteMovie,age+1)

    def isAlive : Boolean = true

    def apply(): String = s"Hi , my name is $name and i like $favouriteMovie movie"

    //exercise
    def apply(n:Int) : String = s"$name watched movie $n times"

    //exercise
    def learns (thing: String ) : String = s"$name is learning $thing"
    def learnsScala: String = this learns "scala"
  }

  val mary = new Person("mary" ,"inception")

  println(mary.likes("inception"))
  // INFIX notation (or) OPERATOR notation
  //---------------------------------------
  println(mary likes "inception") // one argument functions can be called like this

  // Operators in Scala
  val tom = new Person("Tom", "Avengers")
  println(mary.hangoutsWith(tom))
  println(mary hangoutsWith tom ) // infix style . hangoutsWith works like operator

  // + or ? or ! etc  can also be used as method name
  println(mary + tom)
  println(mary.+(tom)) // internally obj.methodName(args)

  println(1+2)
  println(1.+(2))
  // So Technically ALL OPERATORs are METHODs


  // Prefix notation
  //-----------------

  val x = -1 // note here prefix minus -
  val y = 1.unary_- // equivalent of above
  // unary_prefix only works with + - ~ !

  println(!mary)  // mary what the heck ! , here it calls unary_! in Person class


  // POSTFIX notation
  //------------------
  println(mary.isAlive)
  println(mary isAlive)   // no parameter methods can be called postfix like this

  // apply
  //-------

  println(mary.apply())
  println(mary()) // equivalent to above, Note when object with () called meaning, it is calling apply()

  /**
  Exercise
  - overload +
    - which creates new object with nickname , moviename
   */

  println((mary + "rockstar").apply()) // Hi , my name is mary (rockstar)  and i like inception movie

  /**
   * create unary_+ , return new object with increased age by 1
   */

  println((+mary).age) // 1

  /**
   * add learns method in class
   * all learnsscala method that calls above learns method
   * using postfix notation
   */

  println(mary learnsScala)  // mary is learning scala

  /**
   * overload apply(2) give , watched movie twice
   */

  println( mary(2)) // mary watched movie 2 times

}

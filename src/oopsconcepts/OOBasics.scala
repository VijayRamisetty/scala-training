package oopsconcepts

object OOBasics  extends  App {

  val car = new Car // instantiation
  println(car)
  // oopsconcepts.Car@6aaa5eb0
  // packagename.className@hashCode


  val student = new Student("John",25)
  // student.age  // Cannot resolve symbol age
  // class parameters are not fields

  val employee = new Employee("emp1" ,25)
  println(employee.age) // 25

  val person = new Person("John",30)  // this line even prints println(3+5) = 8
  // Note : Every instantiation of a class entire code block is evaluated

  println(person.x)                 //  2
  person.greet("Robert")     // John says Hi,Robert , use this.name
  person.greet                      //  Hi John

  val person2 = new Person("Sam")
  println(person2.age)              // 25 - default
  person2.greet()                   // Hi Sam

}

class Car

class Student(name:String,age:Int)  // constructor , note : class parameters are not fields

// CLASS PARAMETERS vs CLASS FIELDS
class Employee(name:String,val age:Int)  // constructor
// note
// - here 'val (or var) ' age is a class field , not parameter
// - here name is not a class field , but a constructor parameter

class Person(name:String, val age :Int = 25 ) {

   //fields -  body can have val/ var
   val x =2  //  x here is a field

   println(3+5) // intentionally added, on class instantiation this line is evaluated and printed

  // methods
  def greet(name:String) : Unit = {
    // println(s"$name says Hi,$name ")        // Robert says Hi,Robert  , but hot to get  John says Hi,Robert

    println(s"${this.name} says Hi,$name ")   // John says Hi,Robert , use this.name
    // note - name is not a class field but still can be referred by this.name
  }

  // overloading
  def greet():Unit = {
    println(s" Hi $name")   // this prints hi john
  }

  // multiple constructors
  //def this(name:String)  = {
  //  this(name,0)            // this way writing is avoided by changing  field val age :Int = 25 as default
  // }

  def this() = this("Bob")

}




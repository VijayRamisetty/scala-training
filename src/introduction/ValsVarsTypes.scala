package introduction

object ValsVarsTypes extends  App {

  val x : Int = 42;  // immutable can't be reassigned

  println(x)

  // x=2  // Reassignment to val not supported . Vals are immutable ( like finals , constants )

  val y = 42 ; // type is inferred by compiler

  // val z: Int = "SomeString"   // type mismatch error

  val aString: String = "someString"
  val aBoolean : Boolean = true  // or false
  val aChar : Char = 'a'
  val aShort : Short = 9999
  val aFloat : Float = 1234.0F // or f
  val aDouble : Double = 3.145

  // Variables
  var aVariable: Int = 4

  aVariable = 5; // Variables - also know as sideEffects , sideEffect meaning is changing a variable


}

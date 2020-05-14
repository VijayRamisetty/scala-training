package introduction

object StringOperations extends App {

  val aString : String = "Hello Scala World";

  println(aString)                // Hello Scala World
  println(aString.toLowerCase)    // hello scala world
  println(aString.charAt(1))      // e
  println(aString.concat("NEW"))  // Hello Scala WorldNEW
  println(aString.contains("Scala"))   // true
  println(aString.startsWith("Hello")) // true
  println(aString.replace(" " ,"_")) // Hello_Scala_World
  println(aString.length)             // 17

  println(aString.split(" ").toList) // List(Hello, Scala, World)

  println("----------------")

  // String to Int
  val x:String = "2"
  val xInt = x.toInt

  // SCALA specific
  println('a' +: x :+ 'z')        // a2Z , +: append , :+ prepend
  println(aString.reverse)        // dlroW alacS olleH
  println(aString.take(2))             // He

  // SCALA specific Interpolator

  // S- Interpolator
  val name = "John"
  val age=25
  val greeting = s"Hello my name is $name and i turning ${age + 1 } old"  // Hello my name is John and i turning 26 old

  println(greeting)

  // F - Interpolator
  val speed = 1.2f
  println(speed) // 1.2
  val aMessage = f" $name walking speed is $speed%2.2f kmph" // not f" is formatter
  println(aMessage)  // John walking speed is 1.20 kmph

  // raw - Interpolator
  println(raw" This is a \n new Line")  // This is a \n new Line
  val escaped = "This is a \n new Line"
  println(escaped)
  //This is a
  // new Line
  println(raw"$escaped")   // reason is escaped is already evaluated as two line in above line
  //This is a
  // new Line



}

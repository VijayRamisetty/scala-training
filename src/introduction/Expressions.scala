package introduction

object Expressions extends App {

  val x = 1+2 // Expression
  println(x)

  println(2 + 3 * 4 ) // * followed by + gives = 14
  println(2 * 3 + 4 ) // * followed by + gives = 12

  // + - * /
  // bitwise & | ^  leftshift << Right shift >>
  // specific to scala there are >>> Right shift with zero extension

  println(1>5)
  // Relational operations like == !=  >  < >= <=

  // Boolean operators for logic like logical negation !(any boolean) , logical and ie && , ||
  println(!(x>5))

  var aVaiable =2;
  aVaiable += 3; // are side effects only works with variables . -= , += ,  /=
  println(aVaiable)

  // Instructions  Vs Expressions
  // Instructions ( "do something" - java)
  // Expressions ( "evaluates to a value" - scala / functional programming )

  // IF expression
  val aCondition = true ;
  val aConditionedValue = if(aCondition)  "approve" else "reject" //  IF expression evaluates to a value
  println(aConditionedValue)
  println(if(aCondition)  "approve" else "reject" ) // IF expression evaluates to a value

  // Loops
  var i =0;
  val aWhile = while (i<10) {
    println(i)
    i+=1
  }

  // note: mostly avoid while loops as above

  // Scala forces everything to be an expression |  Everything in scala is an expression

  val aWeirdValue = (aVaiable = 3)  //  (aVaialble=3 ) returns Unit - Void , ie assigning a variable is also an Expression

  println(aWeirdValue)  // () <-- this the only value of Unit type can hold

  // note: Sideeffects in scala always return Unit
  // examples: as above ->  println() ,  while , reassignment

  // Code Block, surrounded by { } braces
  // Code block is an expression
  // Value of whole block is last expression
  // aCodeBlock type is inferred as String because last expression evaluates to String
  val aCodeBlock = {
    val x= 1
    val y =2
    if (x>y) "X is big" else "Y is big"
  }

  // more
  // difference between string "HelloWorld" vs println("HelloWorld")
  // "Helloworld" - a string
  // println("Helloworld") -- is an expression , also a sideEffect

  val whoami = {
    2>3
  }
  println(whoami) // Boolean  false
  val whatsmyValue = {
    if(1>5 ) "greater" else "lesser"
    10
  }

  println(whatsmyValue) // 10

}

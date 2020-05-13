package introduction

object Functions extends App {

  // def fun_name(      ) : returnType  =
  def aFunction(a:String , b:Int): String =  // function definition
        a+ " " + b                           // implementation

  println(aFunction("Hello",1))

  // function with multiple implementation lines - i.e can have code block
  def aFunction2(a:String , b:Int): String = {
    println("aFunction2 is called ")
    a+ " " + b                           // implementation
  }
  println(aFunction2("Hello",1))

  // function with no parameters
  def sayHi() : String = "Hi"
  println(sayHi())
  println(sayHi)   // parameterless functions can be called just by name without ( )

  // recursive Function
  def aRepeatedFunction(aString: String , n: Int) : String = {
    if(n==1) aString
    else aString + " " +aRepeatedFunction(aString,n-1)
  }
  println(aRepeatedFunction("Hello",10))

  // " when you need loops use recursive Functions in scala "

  // note : for normal function, mention of  return type is optional where as for recursive function it is mandate

  // function with returnType Unit
  def aFunctionWithSideEffect(aString: String) : Unit = {
    println("hello "+aString) // as println is an expression with retun type as Unit
  }

  aFunctionWithSideEffect("John"); // calls above function and print hello John and returns nothing
                                           // similar to void functions in java

  // functions allows another functions inside them - auxiliary functions

  def OuterFunction(n:Int) : Int = {

    def InnerFunction(a:Int , b:Int) : Int = {
      a*b
    }

    InnerFunction(n,n-1);
  }
  println(OuterFunction(10)) //  10 * 10-1  = 90


  // factorial of a given number =  1 * 2 * .... * n

  def factorial(n : Int): Long = {
    if(n ==1) 1
    else n * factorial(n-1)
  }

  println("factorial(4)= "+factorial(4)) // 24 = 4*3*2*1

  // Fibonacci numbers til n , nth Fibanacci number
  //f(1) =1
  //f(2) =1
  //f(n) = f(n-1)+ f(n-2)

  def fibonacci(n : Int):Long ={
    if(n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
    //  value   : 1  1  2  3  5    8     13    21
    // position:  1  2  3  4  5  f(6)   f(7)   f(8)
    // f(8 ) = f(7) + f(6)
        // f(7) and f(6) are called internally which calls further
  }
  println(fibonacci(8)) // 8th fibonacci number is 21


  // Test a number is prime

  def isNprime(n : Int):Boolean  ={
    def isPrimeUntil(t:Int): Boolean ={
      if (t<=1) true
      else n%t !=0 &&  isPrimeUntil(t-1)
    }

    isPrimeUntil(n/2)
  }
  println(isNprime(13)) // true
  println(isNprime(2003)) // true
  println(isNprime(2004)) // false



  // factorial step by step

  def myFactorial(n : Int): Long = {
    if(n ==1)  {
      println("-->"+n)
      1
    }
    else {
      println(n + "* myFactorial(" + (n-1)+")")
      n * myFactorial(n-1)
    }
  }

 // 4 * ?
  // 3  * ?
   // 2 * ?
    // 1 * ?
    // 1
  println("myFactorial(4)= "+myFactorial(4)) // 24 = 4*3*2*1

  //4* myFactorial(3)
  //3* myFactorial(2)
  //2* myFactorial(1)
  //-->1
  //myFactorial(4)= 24
}


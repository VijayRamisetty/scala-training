package introduction

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion  extends  App{

  // normal recursive Factorial
  def factorial(n:Int) : Long ={
    if(n==1) 1
    else {
      println("computing factorial of "+n +"  - but first i need factorial of = "+ (n-1))
      val result = n * factorial(n-1)
      println("computed factorial of "+ n)
      result
    }
  }
  println(factorial(5)); // 120

  //computing factorial of 5 but first i need factorial of = 4
  //computing factorial of 4 but first i need factorial of = 3
  //computing factorial of 3 but first i need factorial of = 2
  //computing factorial of 2 but first i need factorial of = 1
  //computed factorial of 2
  //computed factorial of 3
  //computed factorial of 4
  //computed factorial of 5
  //120

  // to execute above - Computer Stack gets Filled up , causing limited memory stack to blot

  // println(factorial(5000));
 /**
  computing factorial of 1853  - but first i need factorial of = 1852
  *** java.lang.instrument ASSERTION FAILED ***: "!errorOutstanding" with message transform method call failed at JPLISAgent.c line: 844
  Exception in thread "main" java.lang.StackOverflowError
  at java.nio.CharBuffer.<init>(CharBuffer.java:281)
  **/

   // BetterApproach - tail recursive : use recursive call as the  last expresion

  def smartFactorial(n:Int) : BigInt = {
     @tailrec  // this tell compiler this function is tail recursive
     def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
       if (x <= 1) accumulator
       else {
         println("factorialHelper("+(x-1)+","+x+"*"+accumulator +")")
         factorialHelper(x - 1, x * accumulator)
       }
     }

     factorialHelper(n, 1)
   }

  println(smartFactorial(10)) ; // 3628800

  // factorialHelper(9,10*1)
  // factorialHelper(8,9*10)
  // factorialHelper(7,8*90)
  // factorialHelper(6,7*720)
  // factorialHelper(5,6*5040)
  // factorialHelper(4,5*30240)
  // factorialHelper(3,4*151200)
  // factorialHelper(2,3*604800)
  // factorialHelper(1,2*1814400)
  // 3628800



  // TailRecursion - String concatenation

  def concatTailRec(aString: String , n: Int , accumulator: String) : String ={

    if(n<=0) accumulator
    else concatTailRec(aString, n-1 ,aString + accumulator)
  }

  println(concatTailRec("Hello",10,""))


  // Is prime

  def IsPrime(n:Int) : Boolean = {
    @tailrec
    def isPrimeTailRec(t:Int, isStillPrime:Boolean) :Boolean ={
      if(!isStillPrime) false
      else if(t<=1) true
      else isPrimeTailRec(t-1,n%t !=0 && isStillPrime)
    }

    isPrimeTailRec(n/2,true);
  }

  println(IsPrime((23))) // true

}


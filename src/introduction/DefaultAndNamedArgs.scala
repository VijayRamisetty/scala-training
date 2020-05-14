package introduction

import scala.annotation.tailrec

object DefaultAndNamedArgs extends  App {

  // Normal Factorial
  def myFactorial(n:Int) : Long ={
    if(n<=1) 1
    else n * myFactorial(n-1)
  }

  println(myFactorial(5)) // 120

  // Tail Rec Factorial
  @tailrec
  def myFactoriaTailRec(n:Int, accum :Int) : Long ={
    if(n<=1) accum
    else  myFactoriaTailRec( n-1, n * accum)
  }

  println(myFactoriaTailRec(5,1)) // here you know that always 1 is passed as last argument, how to avoid


  // Tail Rec Factorial with initial default accum arg
  @tailrec
  def myFactoriaTailRecWithDefault(n:Int, accum :Int =1 ) : Long ={
    if(n<=1) accum
    else  myFactoriaTailRecWithDefault( n-1, n * accum)
  }

  println(myFactoriaTailRecWithDefault(5)) // 2nd argument is not passed , so it took default value from function def

  def savePicture(format: String = ".png" , width :Int= 400 , height : Int  = 600) : Unit ={
    println("Saving picture as - format : " +format+ " width: "+width +" height: "+height)
  }

  savePicture() // works with all defaults
  savePicture("JPEG",400,1000)
  savePicture(width = 500)
  savePicture(height = 700,width = 500)
  savePicture(height = 700,width = 500,format = "JPG") // order doesnt matter when named

  /*

    Saving picture as - format : .png width: 400 height: 600
    Saving picture as - format : JPEG width: 400 height: 1000
    Saving picture as - format : .png width: 500 height: 600
    Saving picture as - format : .png width: 500 height: 700
    Saving picture as - format : JPG width: 500 height: 700

  */

}


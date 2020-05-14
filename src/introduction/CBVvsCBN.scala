package introduction

import java.util.jar.Attributes.Name

object CBVvsCBN  extends App {

  def callByValue(x: Long) : Unit={
    println(x) //     28415022028266
    println(x) //     28415022028266
  }

  def callByName(x : => Long) : Unit={
    println(x)    // 28415231402391
    println(x)    // 28415231493950

  }

  callByValue(System.nanoTime())  // callby Value - evaluate expression to Value = 28415022028266 first and pass as argument to function
  callByName(System.nanoTime())   // callby Name  - pass  System.nanoTime() as name , and on usage evaluate

 /*
 note :
  - any argument with  : =>  behaves as call by Name
  - => helpful as part of lazy loading
  - we can use mixed i.e, one as callbyvalue arg other as callbyname
  - callbyval argument is evaluate later point in course of run
  */


  def infinite(): Int = {
    1+infinite
  }

  def printFirst(x:Int, y: => Int ) : Unit = {
    println(x)
  }

//  printFirst(infinite,34)
//  causes
//  Exception in thread "main" java.lang.StackOverflowError
//  at introduction.CBVvsCBN$.infinite(CBVvsCBN.scala:30)
//    infinite is evacuating , so printing is not happening

  printFirst(34,infinite)  // 34

//  here 34 is pass by value , where infinite is pass by name
//  as  infinite is not called/used in printFirst() code block for evaluation , it is not evaluated at all
//  hence printing only 34





}

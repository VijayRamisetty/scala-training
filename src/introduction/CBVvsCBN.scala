package introduction

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

}

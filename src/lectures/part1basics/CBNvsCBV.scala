package lectures.part1basics

object CBNvsCBV extends App {

/*
The Unit type in Scala is used as a return statement for a function when no value is to be returned.
Unit type can be e compared to void data type of other programming languages like Java.
It is a subclass of anytype trait and is used when nothing means to return by the function.
 */

  def calledByValue(x: Long): Unit = {  //the format we put long, because the time functions in SCALA and JVM return longs
    println("by value: " + 1257387745764245L)
    println("by value: " + 1257387745764245L)
  }

  def calledByName(x: => Long): Unit = {      // the => means, it tells the compiler that the parameter will be called by name.
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(System.nanoTime()) // which will tell me the current time of the system in nanoseconds
  calledByName(System.nanoTime())

  /*
  The result will be:
  by value: 1257387745764245
  by value: 1257387745764245
  by name: 30411134735500
  by name: 30411134785700

  !!!!!Why the first two are the same, but the last two are different?

   */


  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())  // when it is by name, the value of the parameter is changing constantly




  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34)
  printFirst(34, infinite())
}


// Call be value: value is computed before call, the same value used everywhere
// Call by name: expression is passed literally, and it is evaluated at every use within the function definition
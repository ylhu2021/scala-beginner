package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO - executed) vs Expressions (VALUE - evaluated)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  // the value of the block is the value of its last expression.
  // the code inside the code block is only visible inside the code block

  // 1. difference between "hello world" vs println("hello world")?
  // ANSWER: the first one is type of string, the second one is an expression which is a side effect.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


}

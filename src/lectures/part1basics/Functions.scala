package lectures.part1basics

object Functions extends App {

  // def name_of_function (name_of_parameter: type, name_of_another_parameter: type): the_type_of_the_result_return =
  //   implementation_of_function



  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))
  // remind: calling a function is also an expression.


  // also parameter list functions can also be called with just their names
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION回归/递推.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */

  //mine//
  def greeting_function (name: String, age: Int): String = {
    "Hi, my name is" + " " + name + " and I am" + " " + age + " " + "years old."
  }
  println(greeting_function("Yaling", 29))


  def factorial_function (n: Int): Int = {
    if (n == 1) n
    else n * factorial_function(n-1)
  }
  println(factorial_function(5))

  def fibonacci_function(n: Int): Int = {
    if (n <= 2 )  1
    else fibonacci_function(n - 1) + fibonacci_function(n - 2)
  }
  println(fibonacci_function(8))

// the fourth one ...... reference


  def greetingForKids(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
  println(greetingForKids("David", 12))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}





package lectures.part2oop

import org.w3c.dom.css.Counter

object OOBasics extends App {

  val person = new Person ("John", 26) // instantiating
  println(person.x)
  person.greet("Daniel")


  //testing 1
  val author = new writer("Charles", "Dickens", 1812)
  val imposter = new writer("Charles", "Dickens", 1812)
  val novel = new novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  //testing 2
  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


  /* If you put person.age wanting to print the age, it will fail!!!
  Because age is a class parameter, but it is not a class member that you can access with the dot operator.
  REMEMBER: class parameters from the constructor and class fields that you can access are two different things

  If you want to convert a class parameter to a field would be to add the 'val' keyword to the parameter,
  like class Person (name: String, val age: Int), then you could use dot operator and it will work.
   */
}

/*
class organizes data and behaviour that is code, instantiation means concrete realizations and memory,
that is actual memory spaces that conform to the code and the data structure that the class describes.
 */


// constructor
class Person (name: String, val age: Int) {
  //body - it defines the implementation of this class.
  val x = 2  // all 'val' or 'var' are fields, which means I can perfectly use as println(person.x)

  println(1 + 3)

  // method - the function which defined inside a class
  def greet (name: String): Unit = println(s"${this.name} says: Hi, $name")
  // keyword this allows to access the current instance being operated on and define a call other constructors

  // overloading - defining methods with the same name but different signatures
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors or overloading constructors
  def this (name: String) = this(name, 0)
  def this() = this ("John Doe")

}
// Basically is saying every single instance of person must be constructed by passing in a name and an age
// class parameters are NOT FIELDS


/*
   Novel and a Writer

   Writer: first name, surname, year
    - method fullname

    Novel: name, year of release, author
     -method: author Age
     -method: is WrittenBy(author)
     -copy (new year of release) = new instance of Novel
 */

class writer (first_name: String, surname: String, val year: Int) {
  def fullname: String = first_name + " " + surname
}

class novel (name: String, year: Int, author: writer)  {
  def authorAge =  year - author.year
  def isWrittenBy (author: writer) = author == this.author
  def copy (newYear: Int): novel = new novel(name, newYear, author)
}



/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new counter
    - overload inc/dec to receive an amoount
 */


class Counter(val count: Int = 0) {
  // if you want to log something, could use side effect, here assuming for logging
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  } // immutability, cannot be modified

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int) : Counter =
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)

}


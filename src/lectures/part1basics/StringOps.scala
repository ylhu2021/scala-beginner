package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

// standard string operations:
  println(str.charAt(2))  // due to it count from 0, we take the 3rd character
  println(str.substring(7, 11)) // the char7 (included), the char11 (excluded)
  println(str.split(" ").toList) // split the string into multiple pieces depending on the delimiter, here is the space
  println(str.startsWith("Hello")) // this returns true or false, depending on whether the original string starts with the parameter
  println(str.replace(" ", "-"))  // replace all the spaces with dashes
  println(str.toLowerCase()) //change to lower or upper case.
  println(str.length)  // get the length of the string.



  val aNumberString = "2"
  val aNumber = aNumberString.toInt  //change string to integer
  println('a' +: aNumberString :+ 'z')  // prepending and appending 预置和追加
  println(str.reverse)  // reverse the string
  println(str.take(2)) //Take two characters



  // Scala-specific: String interpolators. 字符串插值器

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"  // the $ sign tells the compiler that name will be injected in the string
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  // F-interpolators
  // it act as s-interpolators in the sense that they can expand values or complex expressions inside, but they can also receive print f like formats

  val speed = 1.2f  //value is a float
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  // %2.2f which is a print f like format for displaying the value, it means 2 characters, total minimum and two decimals precision
  println(myth)

  // raw-interpolator - work the sames as the s interpolator, though it has the property, they can print characters literally.
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}

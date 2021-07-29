package lectures.part1basics

/**
  * Created by Daniel.
  */
object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =  // Here Int = 1 basically says that if I do not pass the accumulator value, it is going to be implied as one.
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10, 2) // if I do pass one value for the parameter with a default value, the default value will be overwritten.

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)

  /*
  Solution:
    1. pass in every leading argument
    2. name the arguments
   */
  
  savePicture(height = 600, width = 800, format = "bmp")

}

// When 99% of time we call a function with the same parameters, you can just specify a default value for an argument and just omitted when you call it.
// BUT we cannot omit leading default arguments. So we could name our parameters,
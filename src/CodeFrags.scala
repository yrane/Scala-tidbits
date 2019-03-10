object CodeFrags extends App {
  // how to accept variable-arguments(varargs) in Scala
  def fn(vals: String*): Unit = {
    vals.foreach(println)
  }
  val seq_a = Seq("A_KEY","B_KEY")
  // To explode a list in parameters
  fn(seq_a:_*)

  /*
     Methods are similar to functions, with some minor differences. Firstly, they must be defined with the def keyword.
     Secondly, methods can have multiple parameter lists (or none at all). Finally, a return type must be specified
     after the parameter list(s), denoted by a : followed by the return type and value.
   */

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = {
    (x + y) * multiplier
  }
  println(addThenMultiply(1, 2)(3)) // 9
}
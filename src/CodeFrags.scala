object CodeFrags extends App {
  // how to accept variable-arguments(varargs) in Scala
  def fn(vals: String*): Unit = {
    vals.foreach(println)
  }
  val seq_a = Seq("A_KEY","B_KEY")
  // To explode a list in parameters
  fn(seq_a:_*)
}

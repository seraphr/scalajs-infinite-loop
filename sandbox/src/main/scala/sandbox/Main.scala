package sandbox

object Main {
  def main(args: Array[String]): Unit = {
    println("run!")
    Seq.unapplySeq(LazyList.from(0)).drop(1)
    // Stream is same
    //    Seq.unapplySeq(Stream.from(0)).drop(1)
  }
}

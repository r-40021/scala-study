object SimpleSearch extends App {
  val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq
  val matchIndexed = search(text, pattern)

  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] = {
    var matchIndexes = Seq[Int]()
    for (i <- 0 to text.length - 1) {
      val partText = text.slice(i, i + pattern.length)
      if(isMatch(partText, pattern)) {
        matchIndexes = matchIndexes :+ i
      }
    }
    matchIndexes
  }

  def isMatch(textPart: Seq[Char], pattern: Seq[Char]): Boolean = {
    var isMatch = true
    var i = 0
    while(i < pattern.length && isMatch) {
      if (textPart.length < pattern.length || textPart(i) != pattern(i)) isMatch = false
      i = i + 1
    }
    isMatch
  }

  println(s"出現場所：${matchIndexed}")
}
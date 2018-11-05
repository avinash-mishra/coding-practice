object CountingValleys {

  def countValleys(n : Int, s: String): Int = {
    var lvl = 0
    var v = 0

    for (c <- s){
      if (c == 'U')
        lvl +=1
      if (c == 'D')
        lvl -= 1
      if (lvl == 0 && c == 'U')
        v +=1
    }
    return v
  }

  def main(args: Array[String]){
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt
    val s = stdin.readLine

    val result = countValleys(n, s)
    println(result)
  }

}

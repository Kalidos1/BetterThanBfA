package de.htwg.se.BetterThanBfA.model

case class Map(private val map:Array[Tile]) {
  def this(size:Int) = this(new Array[Tile](size))

  def fill():Unit = {
    for (x <- map) {
        x.tileValue_=(2)
    }
  }

  val size: Int = map.length

  override def toString: String = {
    val sb = new StringBuilder("")
    for (s <- map) sb.append(s + ",")
    sb.toString()
  }










}

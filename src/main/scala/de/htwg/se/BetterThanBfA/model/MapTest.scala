package de.htwg.se.BetterThanBfA.model

case class MapTest(private val map:Matrix[Tile]) {
  def this(size:Int) = this(new Matrix[Tile](size,Tile(0)))




}

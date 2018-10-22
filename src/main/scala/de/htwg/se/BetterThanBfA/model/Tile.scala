package de.htwg.se.BetterThanBfA.model

case class Tile(value: Int) {
  def isSet: Boolean = value != 0
}

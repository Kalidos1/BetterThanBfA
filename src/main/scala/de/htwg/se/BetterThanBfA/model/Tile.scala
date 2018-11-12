package de.htwg.se.BetterThanBfA.model

import scala.util.Random;

case class Tile(var value: Int) {
  def isSet: Boolean = value != 0
  def tileValue: Int = value
  def tileValue_= (tileV:Int):Unit = value = tileV
}

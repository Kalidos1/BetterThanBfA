package de.htwg.se.BetterThanBfA.model

trait ArmorInterface {
  def defense(name:String,value:Int):ArmorInterface
  def health(value:Int):ArmorInterface
  //usw...
}

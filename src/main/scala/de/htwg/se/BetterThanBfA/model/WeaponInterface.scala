package de.htwg.se.BetterThanBfA.model

trait WeaponInterface {
  def damage(value:Int,speed:Int):WeaponInterface
  def typ(name:String):WeaponInterface
  //usw...

}

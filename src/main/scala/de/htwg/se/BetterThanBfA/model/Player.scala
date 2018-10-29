package de.htwg.se.BetterThanBfA.model

class Player(name: String,
                  health: Int = 100,
                  defense: Int = 10,
                  mana: Int = 50,
                  strength: Int = 20,
                  agility: Int = 20,
                  intelligence: Int = 20) {

  override def toString: String = name + health + defense + mana + strength + agility + intelligence // or player
  def getHealth():Int = this.health
  def setHealth(health:Int):Player =







}

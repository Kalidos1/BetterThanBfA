package de.htwg.se.BetterThanBfA.model

case class Player(name: String,
                  var _health: Int = 100,
                  var _defense: Int = 10,
                  var _mana: Int = 50,
                  var _strength: Int = 20,
                  var _agility: Int = 20,
                  var _intelligence: Int = 20) {

  //private var _health = 100

  //getter and setter for all attributes
  //Method with "Attribute:" = getter
  //Method with "Attribute:_=" = setter
  def health: Int = _health
  def health_= (value:Int):Unit = _health = value

  def defense: Int = _defense
  def defense_= (value:Int):Unit = _defense = value

  def mana: Int = _mana
  def mana_= (value:Int):Unit = _mana = value

  def strength: Int = _strength
  def strength_= (value:Int):Unit = _strength = value

  def agility: Int = _agility
  def agility_= (value:Int):Unit = _agility = value

  def intelligence: Int = _intelligence
  def intelligence_= (value:Int):Unit = _intelligence = value



  override def toString: String = {
      "Name: " + name + "\nHealth: " + health + "\nDefense: " +
      defense + "\nMana: " + mana + "\nStrength: " + strength +
      "\nAgility: " + agility +"\nIntelligence: " + intelligence
  }
  // or player


  //Java Getter and Setter, but idk if we should use them
  /*def setHealth (value:Int):Unit = this.health = value
  def getHealth:Int = this.health

*/










}

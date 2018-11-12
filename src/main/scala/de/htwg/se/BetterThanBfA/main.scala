package de.htwg.se.BetterThanBfA

import de.htwg.se.BetterThanBfA.model._
import scala.io.StdIn.readLine

object main {

  var test = new Map(10)
  var playertest = Player("Marvin")

  def main(args: Array[String]): Unit = {
    var input: String = ""

    println(playertest.toString)
    println(playertest.health)
    playertest.health_=(200)
    playertest.agility_=(200)
    println(playertest.toString)
    test.fill()




    do {
       println("MapTest : " + test.toString)
       input = readLine()
       println("Input: " + input)
     } while (input != "q")

  }


}
package de.htwg.se.BetterThanBfA

import de.htwg.se.BetterThanBfA.model._
import scala.io.StdIn.readLine

object main {

  var test = new MapTest(3)
  var playertest = Player("Marvin")

  def main(args: Array[String]): Unit = {
    var input: String = ""

    println(playertest.toString)
    println(playertest.health)
    playertest.health_=(200)
    println(playertest.toString)


    /* do {
       println("MapTest : " + test.toString)
       input = readLine()
       println("Input: " + input)
     } while (input != "q")
 */
  }


}
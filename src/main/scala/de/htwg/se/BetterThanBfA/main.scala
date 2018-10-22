package de.htwg.se.BetterThanBfA

import de.htwg.se.BetterThanBfA.model._
import scala.io.StdIn.readLine

object main {

  var test = new MapTest(3)

  def main(args: Array[String]): Unit = {
    var input: String = ""


    do {
      println("MapTest : " + test.toString)
      input = readLine()
      println("Input: " + input)
    } while (input != "q")

  }


}
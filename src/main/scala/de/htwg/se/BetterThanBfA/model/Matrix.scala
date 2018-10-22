package de.htwg.se.BetterThanBfA.model

case class Matrix[T](rows:Vector[Vector[T]]) {
  def this(size:Int,filling:T) = this(Vector.tabulate(size,size){(row,col) => filling})

}

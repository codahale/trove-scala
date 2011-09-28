package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.CharSetFactory
import com.codahale.trove.immutable

trait CharSet extends collection.Set[Char] with CharSetLike[CharSet] {
  override def empty: CharSet = CharSet.empty
}

object CharSet extends CharSetFactory[CharSet] {
  val empty: CharSet = immutable.CharSet.empty

  def newBuilder = immutable.CharSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[CharSet, Char, CharSet] = charsetCanBuildFrom
}

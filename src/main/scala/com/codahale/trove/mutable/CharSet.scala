package com.codahale.trove.mutable

import gnu.trove.set.TCharSet
import gnu.trove.set.hash.TCharHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.{CharSetFactory, CharIterator}

class CharSet(private[this] val underlying: TCharSet)
  extends scala.collection.mutable.Set[Char]
          with com.codahale.trove.collection.CharSet
          with com.codahale.trove.collection.CharSetLike[CharSet]
          with scala.collection.mutable.SetLike[Char, CharSet]
          with Serializable {

  override def empty = CharSet.empty

  def -=(elem: Char) = {
    underlying.remove(elem)
    this
  }

  def +=(elem: Char) = {
    underlying.add(elem)
    this
  }

  def contains(elem: Char) = underlying.contains(elem)

  def iterator = new CharIterator(underlying.iterator)
}


object CharSet extends CharSetFactory[CharSet] {
  def empty: CharSet = new CharSet(new TCharHashSet())
  def newBuilder: Builder[Char, CharSet] = new GrowingBuilder[Char, CharSet](empty)
  implicit def canBuildFrom: CanBuildFrom[CharSet, Char, CharSet] = charsetCanBuildFrom
}

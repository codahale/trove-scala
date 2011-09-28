package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{CharSetFactory, CharIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TCharHashSet

class CharSet(val underlying: TUnmodifiableCharSet) extends scala.collection.immutable.Set[Char]
                      with collection.CharSet
                      with collection.CharSetLike[CharSet]
                      with Serializable {
  override def empty: CharSet = CharSet.empty

  def +(elem: Char): CharSet = {
    val newSet = new TCharHashSet(underlying)
    newSet.add(elem)
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  def -(elem: Char): CharSet = {
    val newSet = new TCharHashSet(underlying)
    newSet.remove(elem)
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  def contains(elem: Char): Boolean = underlying.contains(elem)

  def iterator = new CharIterator(underlying.iterator)
}

object CharSet extends CharSetFactory[CharSet] {
  val empty: CharSet = new CharSet(new TUnmodifiableCharSet(new TCharHashSet(0)))
  def newBuilder: Builder[Char, CharSet] = new SetBuilder[Char, CharSet](empty)
}

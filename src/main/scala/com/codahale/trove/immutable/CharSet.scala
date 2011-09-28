// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.CharSetFactory
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TCharHashSet

class CharSet(private val underlying: TUnmodifiableCharSet)
  extends scala.collection.immutable.Set[Char]
          with collection.CharSet
          with collection.CharSetLike[CharSet]
          with Serializable {
  override def empty: CharSet = CharSet.empty

  override def ++(xs: TraversableOnce[Char]) = {
    val newSet = new TCharHashSet(underlying)
    xs match {
      case s: CharSet => newSet.addAll(s.underlying)
      case other => other.foreach(newSet.add)
    }
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  def +(elem: Char): CharSet = {
    val newSet = new TCharHashSet(underlying)
    newSet.add(elem)
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  override def --(xs: TraversableOnce[Char]) = {
    val newSet = new TCharHashSet(underlying)
    xs match {
      case s: CharSet => newSet.removeAll(s.underlying)
      case other => other.foreach(newSet.remove)
    }
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  def -(elem: Char): CharSet = {
    val newSet = new TCharHashSet(underlying)
    newSet.remove(elem)
    new CharSet(new TUnmodifiableCharSet(newSet))
  }

  def contains(elem: Char): Boolean = underlying.contains(elem)

  def iterator = new collection.CharIterator(underlying.iterator)

  override def size = underlying.size
}

object CharSet extends CharSetFactory[CharSet] {
  val empty: CharSet = new CharSet(new TUnmodifiableCharSet(new TCharHashSet(0)))
  def newBuilder: Builder[Char, CharSet] = new SetBuilder[Char, CharSet](empty)
}

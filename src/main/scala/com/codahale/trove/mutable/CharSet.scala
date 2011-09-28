// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.hash.TCharHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.CharIterator
import com.codahale.trove.generic.CharSetFactory

class CharSet(private val underlying: TCharHashSet)
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

  override def --=(xs: TraversableOnce[Char]) = {
    xs match {
      case s: CharSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Char) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Char]) = {
    xs match {
      case s: CharSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def contains(elem: Char) = underlying.contains(elem)

  def iterator = new CharIterator(underlying.iterator)

  override def size = underlying.size
}


object CharSet extends CharSetFactory[CharSet] {
  def empty: CharSet = new CharSet(new TCharHashSet())
  def newBuilder: Builder[Char, CharSet] = new GrowingBuilder[Char, CharSet](empty)
  implicit def canBuildFrom: CanBuildFrom[CharSet, Char, CharSet] = primitiveCharSetCanBuildFrom
}

package com.codahale.trove.mutable

import gnu.trove.set.TLongSet
import gnu.trove.set.hash.TLongHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.{LongSetFactory, LongIterator}

class LongSet(private[this] val underlying: TLongSet)
  extends scala.collection.mutable.Set[Long]
          with com.codahale.trove.collection.LongSet
          with com.codahale.trove.collection.LongSetLike[LongSet]
          with scala.collection.mutable.SetLike[Long, LongSet]
          with Serializable {

  override def empty = LongSet.empty

  def -=(elem: Long) = {
    underlying.remove(elem)
    this
  }

  def +=(elem: Long) = {
    underlying.add(elem)
    this
  }

  def contains(elem: Long) = underlying.contains(elem)

  def iterator = new LongIterator(underlying.iterator)
}


object LongSet extends LongSetFactory[LongSet] {
  def empty: LongSet = new LongSet(new TLongHashSet())
  def newBuilder: Builder[Long, LongSet] = new GrowingBuilder[Long, LongSet](empty)
  implicit def canBuildFrom: CanBuildFrom[LongSet, Long, LongSet] = longsetCanBuildFrom
}

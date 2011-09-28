package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{LongSetFactory, LongIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableLongSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TLongHashSet

class LongSet(val underlying: TUnmodifiableLongSet) extends scala.collection.immutable.Set[Long]
                      with collection.LongSet
                      with collection.LongSetLike[LongSet]
                      with Serializable {
  override def empty: LongSet = LongSet.empty

  def +(elem: Long): LongSet = {
    val newSet = new TLongHashSet(underlying)
    newSet.add(elem)
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  def -(elem: Long): LongSet = {
    val newSet = new TLongHashSet(underlying)
    newSet.remove(elem)
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  def contains(elem: Long): Boolean = underlying.contains(elem)

  def iterator = new LongIterator(underlying.iterator)
}

object LongSet extends LongSetFactory[LongSet] {
  val empty: LongSet = new LongSet(new TUnmodifiableLongSet(new TLongHashSet(0)))
  def newBuilder: Builder[Long, LongSet] = new SetBuilder[Long, LongSet](empty)
}

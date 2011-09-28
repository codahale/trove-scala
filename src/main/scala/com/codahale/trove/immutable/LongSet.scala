// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.LongSetFactory
import gnu.trove.impl.unmodifiable.TUnmodifiableLongSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TLongHashSet

class LongSet(private val underlying: TUnmodifiableLongSet)
  extends scala.collection.immutable.Set[Long]
          with collection.LongSet
          with collection.LongSetLike[LongSet]
          with Serializable {
  override def empty: LongSet = LongSet.empty

  override def ++(xs: TraversableOnce[Long]) = {
    val newSet = new TLongHashSet(underlying)
    xs match {
      case s: LongSet => newSet.addAll(s.underlying)
      case other => other.foreach(newSet.add)
    }
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  def +(elem: Long): LongSet = {
    val newSet = new TLongHashSet(underlying)
    newSet.add(elem)
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  override def --(xs: TraversableOnce[Long]) = {
    val newSet = new TLongHashSet(underlying)
    xs match {
      case s: LongSet => newSet.removeAll(s.underlying)
      case other => other.foreach(newSet.remove)
    }
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  def -(elem: Long): LongSet = {
    val newSet = new TLongHashSet(underlying)
    newSet.remove(elem)
    new LongSet(new TUnmodifiableLongSet(newSet))
  }

  def contains(elem: Long): Boolean = underlying.contains(elem)

  def iterator = new collection.LongIterator(underlying.iterator)

  override def size = underlying.size
}

object LongSet extends LongSetFactory[LongSet] {
  val empty: LongSet = new LongSet(new TUnmodifiableLongSet(new TLongHashSet(0)))
  def newBuilder: Builder[Long, LongSet] = new SetBuilder[Long, LongSet](empty)
}

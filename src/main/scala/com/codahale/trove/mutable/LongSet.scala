// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.hash.TLongHashSet
import gnu.trove.impl.unmodifiable.TUnmodifiableLongSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.LongIterator
import com.codahale.trove.generic.LongSetFactory
import com.codahale.trove.immutable.{LongSet => ImmutableLongSet}

class LongSet(private val underlying: TLongHashSet)
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

  override def --=(xs: TraversableOnce[Long]) = {
    xs match {
      case s: LongSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Long) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Long]) = {
    xs match {
      case s: LongSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def contains(elem: Long) = underlying.contains(elem)

  def iterator = new LongIterator(underlying.iterator)

  override def toSet[B >: Long] = new ImmutableLongSet(new TUnmodifiableLongSet(underlying)).asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}


object LongSet extends LongSetFactory[LongSet] {
  def empty: LongSet = new LongSet(new TLongHashSet())
  def newBuilder: Builder[Long, LongSet] = new GrowingBuilder[Long, LongSet](empty)
  implicit def canBuildFrom: CanBuildFrom[LongSet, Long, LongSet] = primitiveLongSetCanBuildFrom
}

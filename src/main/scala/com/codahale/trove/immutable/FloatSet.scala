package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{FloatSetFactory, FloatIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableFloatSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TFloatHashSet

class FloatSet(val underlying: TUnmodifiableFloatSet) extends scala.collection.immutable.Set[Float]
                      with collection.FloatSet
                      with collection.FloatSetLike[FloatSet]
                      with Serializable {
  override def empty: FloatSet = FloatSet.empty

  def +(elem: Float): FloatSet = {
    val newSet = new TFloatHashSet(underlying)
    newSet.add(elem)
    new FloatSet(new TUnmodifiableFloatSet(newSet))
  }

  def -(elem: Float): FloatSet = {
    val newSet = new TFloatHashSet(underlying)
    newSet.remove(elem)
    new FloatSet(new TUnmodifiableFloatSet(newSet))
  }

  def contains(elem: Float): Boolean = underlying.contains(elem)

  def iterator = new FloatIterator(underlying.iterator)
}

object FloatSet extends FloatSetFactory[FloatSet] {
  val empty: FloatSet = new FloatSet(new TUnmodifiableFloatSet(new TFloatHashSet(0)))
  def newBuilder: Builder[Float, FloatSet] = new SetBuilder[Float, FloatSet](empty)
}
